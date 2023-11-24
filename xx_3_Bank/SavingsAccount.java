import java.math.BigDecimal;

public class SavingsAccount extends MyAccount {
    public SavingsAccount(Client holderName) {
        super(holderName);
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        int comparisonResult = super.balance.compareTo(bigDecimal);
        if (comparisonResult < 0) {
            return false;
        }

        super.balance = super.getBalance().subtract(bigDecimal);
        return true;
    }
}
