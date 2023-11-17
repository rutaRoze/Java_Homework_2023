
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNegativeNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num < 0) {
                countOfNegativeNumbers++;
            }
        }
        System.out.println("Number of negative numbers: " + countOfNegativeNumbers);
    }
}
