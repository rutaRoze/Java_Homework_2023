
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDays = Integer.parseInt(scanner.nextLine());
        int hoursInADay = 24;
        int minutesInHour = 60;
        int secInMinute = 60;

        int daysInSeconds = numOfDays * hoursInADay * minutesInHour * secInMinute;

        System.out.println(daysInSeconds);
    }
}
