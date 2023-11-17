import java.util.Scanner;

public class SumOfNumberDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:");
        long num = Long.parseLong(scan.nextLine());
        int sum = sumDigits(num);
        System.out.println("The sum of digits: " + sum);

    }

    public static int sumDigits(long n) {

        int sum = 0;
        while (n != 0) {
            long extractedDigit = n % 10;
            n = n / 10;
            sum += extractedDigit;
        }
        return sum;
    }
}
