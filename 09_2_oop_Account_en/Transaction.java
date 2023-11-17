import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private Date date;
    private char transactionType;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char transactionType, double amount, double balance, String description) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        String newDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.date);
        return newDate;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(char transactionType) {
        this.transactionType = transactionType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction(" +
                "transactionType=" + this.transactionType +
                ", amount=" + this.getAmount() +
                ", balance=" + this.getBalance() +
                ", description=" + this.getDescription() + ")";
    }
}
