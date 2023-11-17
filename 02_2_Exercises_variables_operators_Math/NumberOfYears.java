import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        long numOfMinutes = Long.parseLong(scanner.nextLine());

        int minutesIn1Hour = 60;
        int hoursIn1Day = 24;
        int daysIn1Year = 365;

        long resultInDays = numOfMinutes / minutesIn1Hour / hoursIn1Day;
        long resultInYears = resultInDays / daysIn1Year;
        long remainingDaysOfYear = resultInDays % daysIn1Year;

        System.out.printf("%d minutes is approximately %d and %d days",
                numOfMinutes, resultInYears, remainingDaysOfYear);
    }
}
