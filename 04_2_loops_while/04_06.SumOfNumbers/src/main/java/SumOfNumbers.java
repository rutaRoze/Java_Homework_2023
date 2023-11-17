
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                sumOfNumbers += num;
            }
        }
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
