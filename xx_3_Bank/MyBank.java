import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class MyBank implements Bank {
    private BigDecimal totalReserves;
    Collection<Account> accounts;
    Account account;

    public MyBank() {
        this.totalReserves = BigDecimal.ZERO;
        accounts = new ArrayList<>();
    }

    @Override
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        this.totalReserves = accounts
                .stream().map(Account::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);

        return this.totalReserves;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accounts;
    }

    @Override
    public Account openDebitAccount(String clientName) {
        for (Account acc : accounts) {
            if (acc.getHolderName().equals(clientName)) {
                return null;
            }
        }

        this.account = new SavingsAccount(new Client(clientName));
        this.accounts.add(account);
        return this.account;
    }

    @Override
    public Account openCreditAccount(String clientName, BigDecimal credit) {
        for (Account acc : accounts) {
            if (acc.getHolderName().equals(clientName)) {
                return null;
            }
        }
        this.account = new CreditAccount(new Client(clientName), credit);
        this.accounts.add(account);
        return this.account;
    }

    @Override
    public Account getAccountByHolderName(String clientName) {
        return accounts
                .stream()
                .filter(acc -> acc.getHolderName().equals(clientName))
                .findFirst().orElse(null);

    }

    @Override
    public Account getAccountByNumber(String accountNum) {
        return accounts
                .stream()
                .filter(acc -> acc.getNumber().equals(accountNum))
                .findFirst().orElse(null);
    }

    @Override
    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    @Override
    public String toString() {
        return "MyBank{" +
                "totalReserves=" + totalReserves +
                ", accountsInfo=" + accounts +
                ", account=" + account +
                '}';
    }
}
