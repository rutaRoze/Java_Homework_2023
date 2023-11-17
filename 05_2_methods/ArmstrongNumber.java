import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter starting number, press 'enter' to exit:");
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int startNum = Integer.parseInt(input);

            System.out.println("Enter ending number:");
            int endNum = Integer.parseInt(scan.nextLine());

            for (int i = startNum; i <= endNum; i++) {
                if (isArmstrongNumber(i)) {
                    System.out.println(i + " is Armstrong number.");
                }
            }
        }
    }

    public static int countingDigitsOfNum(int num) {

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int exponentingDigitsOfNumber(int number, int power) {
        int numberExponentiation = 1;
        for (int i = 1; i <= power; i++) {
            numberExponentiation = numberExponentiation * number;
        }
        return numberExponentiation;
    }

    public static int countingSumOfPoweredDigits(int num) {

        int digitCount = countingDigitsOfNum(num);
        int sumNumber = 0;
        int changedNum = num;
        while (changedNum != 0) {
            int extractedNumber = changedNum % 10;
            changedNum = changedNum / 10;

            int extractedNumberExponentiation = exponentingDigitsOfNumber(extractedNumber, digitCount);

            sumNumber += extractedNumberExponentiation;
        }
        return sumNumber;
    }

    public static boolean isArmstrongNumber(int num) {
        return num == countingSumOfPoweredDigits(num);
    }
}
