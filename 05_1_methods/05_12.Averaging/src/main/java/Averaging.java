
public class Averaging {

    // implement the sum method here again
    public static int sum(int num1, int num2, int num3, int num4) {
        // write some code here
        return num1 + num2 + num3 + num4;
    }

    public static double average(int num1, int num2, int num3, int num4) {
        //write some code here
        return (double) sum(num1, num2, num3, num4) / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
