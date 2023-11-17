
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give point [0-10]:");
        int givenPoints = Integer.parseInt(scan.nextLine());

        if (givenPoints > 100) {
            System.out.println("Incredible!");
        } else if (givenPoints >= 90) {
            System.out.println(5);
        } else if (givenPoints >= 80) {
            System.out.println(4);
        } else if (givenPoints >= 70) {
            System.out.println(3);
        } else if (givenPoints >= 60) {
            System.out.println(2);
        } else if (givenPoints >= 50) {
            System.out.println(1);
        } else if (givenPoints >= 0) {
            System.out.println("failed");
        } else {
            System.out.println("Impossible!");
        }

    }
}
