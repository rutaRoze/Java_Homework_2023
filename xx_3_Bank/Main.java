import java.math.BigDecimal;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {


        MyBank bank = new MyBank();
        bank.openDebitAccount("Ruta");

        bank.openCreditAccount("Tomas", BigDecimal.valueOf(500));

        System.out.println(bank.getAllAccounts());
    }
}
