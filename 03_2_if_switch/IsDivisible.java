import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer:");
        int num = Integer.parseInt(scan.nextLine());

        int divisor4 = 4;
        int divisor5 = 5;

        System.out.printf("Is %d divisible by %d and %d? ", num, divisor4, divisor5);
        System.out.println(num % divisor4 == 0 && num % divisor5 == 0);

        System.out.printf("Is %d divisible by %d or %d? ", num, divisor4, divisor5);
        System.out.println(num % divisor4 == 0 || num % divisor5 == 0);

        System.out.printf("Is %d divisible by %d or %d but not both? ", num, divisor4, divisor5);
        System.out.println(num % divisor4 == 0 ^ num % divisor5 == 0);
    }
}
