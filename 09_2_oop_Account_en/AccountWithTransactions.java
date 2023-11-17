import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AccountWithTransactions {
    private String customerName;
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public AccountWithTransactions() {
        this(0, 0);
    }

    public AccountWithTransactions(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public AccountWithTransactions(String customerName, int id, double initialBalance) {
        this.customerName = customerName;
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        String newDate = new SimpleDateFormat("yyyy-MM-dd").format(this.dateCreated);
        return newDate;
    }

    public double getMonthlyInterestRate() {
        return this.getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return this.getBalance() * this.getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount, String description) {
        Transaction transaction = new Transaction('W', amount, this.getBalance(), description);
        transactions.add(transaction);
        this.setBalance(this.getBalance() - amount);
    }

    public void deposit(double amount, String description) {
        Transaction transaction = new Transaction('D', amount, this.getBalance(), description);
        transactions.add(transaction);
        this.setBalance(this.getBalance() + amount);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void printSummary() {
        System.out.println("Account:" +
                "name=" + this.getCustomerName() +
                ", balance=" + this.getBalance() +
                ", monthly interest=" + this.getMonthlyInterest() +
                ", dateCreated=" + this.getDateCreated());
        this.printTransactions();
    }

//    @Override
//    public String toString() {
//        return "Account:" +
//                "name=" + this.getCustomerName() +
//                ", balance=" + this.getBalance() +
//                ", monthly interest=" + this.getMonthlyInterest() +
//                ", dateCreated=" + this.getDateCreated();
//    }
}
