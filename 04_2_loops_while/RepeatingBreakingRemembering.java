import java.util.Scanner;

public class RepeatingBreakingRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int eventNumCount = 0;
        int oddNumCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            } else {
                sum += number;
                count++;
            }

            if (number % 2 == 0) {
                eventNumCount++;
            } else {
                oddNumCount++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even:" + eventNumCount);
        System.out.println("Odd: " + oddNumCount);
    }
}
