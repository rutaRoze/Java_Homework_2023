
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 

        System.out.println("Give a number:");
        int num = Integer.parseInt(scan.nextLine());

        if (num % 2 == 0) {
            System.out.printf("Number %d is even.", num);
        } else
            System.out.printf("Number %d is odd.", num);
    }
}
