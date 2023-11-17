
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int lastNum = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = 0;
        for ( int i = 1; i <= lastNum; i++) {
            sumOfNumbers += i;
        }
        System.out.println("The sum is: " + sumOfNumbers);
    }
}
