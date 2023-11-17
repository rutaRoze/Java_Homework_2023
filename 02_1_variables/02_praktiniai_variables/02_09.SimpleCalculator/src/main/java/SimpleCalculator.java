
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.parseInt(scanner.nextLine());

        int sumResult = firstNum + secondNum;
        int subtractionResult = firstNum - secondNum;
        int multiplicationResult = firstNum * secondNum;
        double divisionResult = (double) firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + sumResult);
        System.out.println(firstNum + " - " + secondNum + " = " + subtractionResult);
        System.out.println(firstNum + " * " + secondNum + " = " + multiplicationResult);
        System.out.println(firstNum + " / " + secondNum + " = " + divisionResult);

//        System.out.printf("%d + %d = %d\n", firstNum, secondNum, sumResult);
//        System.out.printf("%d - %d = %d\n", firstNum, secondNum, subtractionResult);
//        System.out.printf("%d * %d = %d\n", firstNum, secondNum, multiplicationResult);
//        System.out.printf("%d / %d = %.1f", firstNum, secondNum, divisionResult);
    }
}
