import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    private int id;
    protected double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        this(0, 0);
    }

    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        this.dateCreated = new Date();
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

    public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public String toString() {
        return "Account:" +
                "balance=" + this.getBalance() +
                ", monthly interest=" + this.getMonthlyInterest() +
                ", dateCreated=" + this.getDateCreated();
    }
}
