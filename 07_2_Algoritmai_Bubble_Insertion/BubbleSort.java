import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {9, 2, 4, 1, 5};

        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);

    }

    public static void bubbleSort(int[] array) {

        int sizeOfArray = array.length;

        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i <= sizeOfArray - 1; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println(Arrays.toString(array));

    }
}
