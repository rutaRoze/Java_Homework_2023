import java.math.BigDecimal;

public class CreditAccount extends MyAccount{

    private BigDecimal creditAllowance;
    public CreditAccount(Client holderName, BigDecimal creditAllowance) {
        super(holderName);
        this.creditAllowance = creditAllowance;
    }

    public BigDecimal getCreditAllowance() {
        return creditAllowance;
    }

    public void setCreditAllowance(BigDecimal creditAllowance) {
        this.creditAllowance = creditAllowance;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        BigDecimal totalAllowances = super.getBalance().add(creditAllowance);
        int comparisonResult = totalAllowances.compareTo(bigDecimal);
        if (comparisonResult < 0) {
            return false;
        }

        super.balance = super.getBalance().subtract(bigDecimal);
        return true;
    }

}
