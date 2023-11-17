public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (super.getBalance() >= amount) {
            super.setBalance(super.getBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount: " + super.getBalance();
    }
}
