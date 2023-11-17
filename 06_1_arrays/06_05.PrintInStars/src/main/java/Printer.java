
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }


    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int value : array) {
            printStars(value);
        }
    }

    public static void printStars(int times) {
        // Write some code in here
        for (int i = 0; i < times; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
