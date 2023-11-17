public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (super.getBalance() + this.overdraftLimit >= amount) {
            //super.setBalance(super.getBalance() - amount);
            super.balance = super.getBalance() - amount;

        }
    }

    @Override
    public String toString() {
        return "CheckingAccount: " + super.getBalance() +
                ", overdraftLimit=" + overdraftLimit;
    }
}
