import java.util.Scanner;

public class MileConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        int miles = Integer.parseInt(scanner.nextLine());

        double milesToKilometers = miles * 1.6;

        System.out.printf("%d miles is %.1f kilometers", miles, milesToKilometers);
    }
}
