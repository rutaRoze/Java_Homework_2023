
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum == 9999) {
                break;
            }

            numbers.add(inputNum);

        }

        int smallestNum = 9999;
        for (Integer number : numbers) {
            if (number < smallestNum) {
                smallestNum = number;
            }
        }

        System.out.println("Smallest number: " + smallestNum);

        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) == smallestNum) {
                System.out.println("Found at index: " + index);
            }
        }
    }
}
