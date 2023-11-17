package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // Write your program here
        int num = number;
        int remainder = num % 10;
        int sum = 0 + remainder;

        num = num / 10;
        remainder = num % 10;
        sum = sum + remainder;

        num = num / 10;
        remainder = num % 10;
        sum = sum + remainder;

        num = num / 10;
        remainder = num % 10;
        sum = sum + remainder;

        System.out.println(sum);
    }
}
