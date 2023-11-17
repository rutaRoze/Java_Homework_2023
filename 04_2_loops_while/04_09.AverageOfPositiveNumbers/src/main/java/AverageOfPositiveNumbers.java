
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPositives = 0;
        int sumOfPositives = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                countOfPositives++;
                sumOfPositives += num;
            }
        }

        double average = (double) sumOfPositives / countOfPositives;

        if (countOfPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + average);

        }
    }
}
