import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = Integer.parseInt(scan.nextLine());

        if (isPalindrome(number)) {
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("Number is not palindrome.");
        }
    }

    public static int reverse(int num) {

        int reverseNUmber = 0;
        while (num != 0) {
            int extractedNumber = num % 10;
            reverseNUmber = reverseNUmber * 10 + extractedNumber;
            num = num / 10;
        }
        return reverseNUmber;

    }

    public static boolean isPalindrome(int num) {

        return num == reverse(num);
    }
}
