import ibank.Account;

import java.math.BigDecimal;
import java.util.Objects;

public class MyAccount implements Account {

    private String accountNumber;
    private static int numbersForAccount = 0;
    private Client holderName;
    protected BigDecimal balance;

    public MyAccount(Client holderName) {
        this.accountNumber = generateNumber();;
        this.holderName = holderName;
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public String getNumber() {
        return this.accountNumber;
    }

    private String generateNumber() {
        numbersForAccount++;
        return "LT" + String.format("%010d", numbersForAccount);
    }


    @Override
    public String getHolderName() {
        return holderName.getName();
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        this.balance = this.getBalance().add(bigDecimal);
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAccount myAccount = (MyAccount) o;
        return Objects.equals(accountNumber, myAccount.accountNumber) && Objects.equals(holderName, myAccount.holderName);
    }

    @Override
    public String toString() {
        return  "accountNumber='" + accountNumber + '\'' +
                ", holderName=" + holderName +
                ", balance=" + balance;
    }
}
