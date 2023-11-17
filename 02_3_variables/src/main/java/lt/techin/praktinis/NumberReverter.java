package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        // Write your program here
        int num = number;
        int remainder = num % 10;
        int reverse = 0 * 10 + remainder;

        num = num / 10;
        remainder = num % 10;
        reverse = reverse * 10 + remainder;

        num = num / 10;
        remainder = num % 10;
        reverse = reverse * 10 + remainder;

        System.out.println(reverse);
    }
}
