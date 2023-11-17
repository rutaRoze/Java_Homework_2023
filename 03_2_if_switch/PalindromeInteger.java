import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three-digit integer:");
        int number = Integer.parseInt(scan.nextLine());

        // reversing input number for checking palindromy
//        int remainder = number % 10;
//        int reverseNum = 0 * 10 + remainder;
//        int leftNum = number / 10;
//
//        remainder = leftNum % 10;
//        reverseNum = reverseNum * 10 + remainder;
//        leftNum = leftNum / 10;
//
//        remainder = leftNum % 10;
//        reverseNum = reverseNum * 10 + remainder;
//        leftNum = leftNum / 10;

        int reverseNum = 0;
        int numToChange = number;
        while (numToChange != 0) {
            int remainder = numToChange % 10;
            reverseNum = reverseNum * 10 + remainder;
            numToChange = numToChange / 10;
        }

        // comparing values
        if (number == reverseNum) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
