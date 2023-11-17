
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int inputNum = Integer.parseInt(scanner.nextLine());

            if (inputNum == -1) {
                break;
            }

            numbers.add(inputNum);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);
        
    }
}
