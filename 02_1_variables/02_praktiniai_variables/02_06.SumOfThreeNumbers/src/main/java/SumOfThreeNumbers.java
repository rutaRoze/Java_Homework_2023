
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sumOfThreeNum = firstNum + secondNum + thirdNum;

        System.out.println("The sum of the numbers is " + sumOfThreeNum);
    }
}
