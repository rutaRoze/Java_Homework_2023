package lt.techin.bank;

import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankRoze implements Bank {

    protected SequenceGenerator accountIDGenerator;
    protected SequenceGenerator customerIDGenerator;
    protected SequenceGenerator operationIDGenerator;
    private List<Customer> customers;
    private Map<Long, Account> accounts;
    private CurrencyConverter converter;


    public BankRoze(CurrencyConverter currencyConverter) {
        this.customerIDGenerator = new SequenceGenerator();
        this.accountIDGenerator = new SequenceGenerator();
        this.operationIDGenerator = new SequenceGenerator();
        this.customers = new ArrayList<>();
        this.accounts = new HashMap<>();
        this.converter = currencyConverter;
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {

        if (personCode == null || personName == null) {
            throw new NullPointerException();
        }

        for (Customer customer : customers) {
            if (customer.getPersonCode().equals(personCode)) {
                throw new CustomerCreateException("Customer already exist");
            }
        }

        long customerID = customerIDGenerator.getNext();
        Customer newCustomer = new Customer(customerID, personCode, personName);
        customers.add(newCustomer);

        return newCustomer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {

        if (customer == null || currency == null) {
            throw new NullPointerException();
        }

        if (!customers.contains(customer)) {
            throw new AccountCreateException("Customer not found");
        }

        long accountID = accountIDGenerator.getNext();
        Account newAccount = new Account(accountID, customer, currency, new Money("0"));
        accounts.put(accountID, newAccount);
        customer.addAccount(newAccount);

        return newAccount;
    }

    @Override
    public Operation transferMoney(Account debit, Account credit, Money amountToTransfer) {

        long operationID = operationIDGenerator.getNext();

        if (debit.getBalance().isLessThan(amountToTransfer)) {
            throw new InsufficientFundsException("Not enough money");
        }

        debit.setBalance(debit.getBalance().substract(amountToTransfer));
        Money convertedMoney = converter.convert(debit.getCurrency(), credit.getCurrency(), amountToTransfer);
        credit.setBalance(credit.getBalance().add(convertedMoney));

        return new Operation(operationID, debit, credit, amountToTransfer);
    }

    @Override
    public Money getBalance(Currency currency) {

        Money balance = new Money(0);
        for (Account acc : accounts.values()) {
            Money convertedMoney = converter.convert(acc.getCurrency(), currency, acc.getBalance());
            balance = balance.add(convertedMoney);
        }

        return balance;
    }
}
