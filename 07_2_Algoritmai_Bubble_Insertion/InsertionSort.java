import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 2, 4, 1, 5};

        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers);

    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentNum = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentNum) {

                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = currentNum;

            System.out.println(Arrays.toString(array));
        }
    }
}
