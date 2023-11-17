
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.parseInt(scanner.nextLine());

        int factorialCount = 1;
        for (int i = 1; i <= num; i++) {
            factorialCount = factorialCount * i;
        }
        System.out.println("Factorial: " + factorialCount);
    }
}
