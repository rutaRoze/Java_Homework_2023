
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int thirdNum = Integer.parseInt(scanner.nextLine());

        double result = (double) (firstNum + secondNum + thirdNum) / 3;

        System.out.println("The average is " + result);
    }
}
