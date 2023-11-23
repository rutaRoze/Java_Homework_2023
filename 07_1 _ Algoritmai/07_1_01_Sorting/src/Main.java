import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] numbers = {5, 3, 8, 1, 15, 6};

        sort(numbers);

    }

    public static int smallest(int[] array) {

        int smallest = 99999;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;

    }

    public static int indexOfTheSmallest(int[] array) {

        int smallestNum = 9999;
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {

        int smallestNum = 9999;
        int indexOfSmallest = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] numbers) {

        System.out.println(Arrays.toString(numbers));

        int smallestIndex;
        for (int i = 0; i < numbers.length; i++) {
            smallestIndex = indexOfTheSmallestStartingFrom(numbers, i);
            swap(numbers, i, smallestIndex);

            System.out.println(Arrays.toString(numbers));
        }


//        for (int j = 0; j <= numbers.length - 1; j++) {
//            for (int i = 0; i <= numbers.length - 1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                }
//            }
//
//            System.out.println(Arrays.toString(numbers));
//
//        }


    }

}
