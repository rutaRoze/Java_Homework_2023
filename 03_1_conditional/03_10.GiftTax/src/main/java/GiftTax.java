
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.parseInt(scan.nextLine());

        //int tax = 0;
        if (giftValue > 1_000_000) {
            double tax = 142100 + (giftValue - 1_000_000) * 0.17;
            System.out.println("Tax: " + tax);
        } else if (giftValue > 200_000) {
            double tax = 22_100 + (giftValue - 200_000) * 0.15;
            System.out.println("Tax: " + tax);
        } else if (giftValue > 55_000) {
            double tax = 4_700 + (giftValue - 55_000) * 0.12;
            System.out.println("Tax: " + tax);
        } else if (giftValue > 25_000) {
            double tax = 1_700 + (giftValue - 25_000) * 0.1;
            System.out.println("Tax: " + tax);
        } else if (giftValue > 5_000) {
            double tax = 100 + (giftValue - 5_000) * 0.08;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
