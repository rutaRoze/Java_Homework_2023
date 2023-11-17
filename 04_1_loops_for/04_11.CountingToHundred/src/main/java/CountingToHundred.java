
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = inputNum; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
