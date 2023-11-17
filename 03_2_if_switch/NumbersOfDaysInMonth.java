import java.util.Scanner;

public class NumbersOfDaysInMonth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month (in integers):");
        int month = Integer.parseInt(scan.nextLine());

        System.out.println("Enter and year:");
        int year = Integer.parseInt(scan.nextLine());

        boolean isLeapYear = false;
        if (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        }

        int daysInAMonth = 0;
        String monthName = " ";

        switch (month) {
            case 1 -> {
                daysInAMonth = 31;
                monthName = "January";
            }
            case 2 -> {
                if (isLeapYear) {
                    daysInAMonth = 29;
                    monthName = "February";
                } else {
                    daysInAMonth = 28;
                    monthName = "February";
                }
            }
            case 3 -> {
                daysInAMonth = 31;
                monthName = "March";
            }
            case 4 -> {
                daysInAMonth = 30;
                monthName = "April";
            }
            case 5 -> {
                daysInAMonth = 31;
                monthName = "May";
            }
            case 6 -> {
                daysInAMonth = 30;
                monthName = "June";
            }
            case 7 -> {
                daysInAMonth = 31;
                monthName = "July";
            }
            case 8 -> {
                daysInAMonth = 31;
                monthName = "August";
            }
            case 9 -> {
                daysInAMonth = 30;
                monthName = "September";
            }
            case 10 -> {
                daysInAMonth = 31;
                monthName = "October";
            }
            case 11 -> {
                daysInAMonth = 30;
                monthName = "November";
            }
            case 12 -> {
                daysInAMonth = 31;
                monthName = "December";
            }
            default -> System.out.println("Invalid month");
        }

        if (month > 0 && month <= 12) {
            System.out.println(monthName + year + " has " + daysInAMonth + " days.");
        }
    }

}
