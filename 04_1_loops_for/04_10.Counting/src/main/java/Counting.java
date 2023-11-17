
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Give a number:");
        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= inputNum; i++) {
            System.out.println(i);
        }
    }
}
