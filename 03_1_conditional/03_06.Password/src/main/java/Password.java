
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String password = scan.nextLine();

        String correctPassword = "Caput Draconis";

        String isPasswordCorrect = password.equals(correctPassword) ? "Welcome!" : "Off with you!";

        System.out.println(isPasswordCorrect);
    }
}
