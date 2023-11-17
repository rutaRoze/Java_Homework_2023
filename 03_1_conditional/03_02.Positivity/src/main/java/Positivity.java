
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number.");
        int num = Integer.parseInt(scan.nextLine());

        String isPositive = num > 0 ? "The number is positive" : "The number is not positive";

        System.out.println(isPositive);

    }
}
