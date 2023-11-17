
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int eventNumCount = 0;
        int oddNumCount = 0;

        while (true) {
            System.out.println("Give numbers:");
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
