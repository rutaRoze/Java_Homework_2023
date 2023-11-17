package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int[] array = generateRandomArray(5, 10, 20);
        System.out.println(Arrays.toString(array));

        int[] newArray = removeElementAndReturnNewArray(arr, 2);
        System.out.println(Arrays.toString(newArray));

        int[] newArray2 = insertElementAndReturnNewArray(arr, 2, 9);
        System.out.println(Arrays.toString(newArray2));

        int[] newArray3 = reverseArray(arr);
        System.out.println(Arrays.toString(newArray3));

        reverseInPlace(arr);

    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        //TODO

        int[] numbersArray = new int[size];
        for (int index = 0; index < numbersArray.length; index++) {
            numbersArray[index] = (int) (Math.random() * (max - min + 1) + min);
        }
        return numbersArray;
    }

    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        //TODO
        if (k < 0 || k >= arr.length) {
            return null;
        }

        int[] newArr = new int[arr.length - 1];
        for (int index = 0, newArrIndex = 0; index < arr.length; index++) {
            if (index != k) {
                newArr[newArrIndex++] = arr[index];
            }
        }
//        System.arraycopy(arr, 0, newArr, 0, k);
//        System.arraycopy(arr, k + 1, newArr, k, arr.length - k - 1);

        return newArr;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        //TODO
        if (k < 0 || k >= arr.length) {
            return null;
        }

        int[] newArr = new int[arr.length + 1];

        for (int index = 0; index < newArr.length; index++) {
            if (index < k) {
                newArr[index] = arr[index];
            } else if (index == k) {
                newArr[index] = x;
            } else {
                newArr[index] = arr[index - 1];
            }
        }

//        for (int index = 0, oldArrIndex = 0; index < newArr.length; index++) {
//            if (index == k) {
//                newArr[index] = x;
//            } else {
//                newArr[index] = arr[oldArrIndex++];
//            }
//        }

        return newArr;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        //TODO
        int[] newArr = new int[arr.length];
        for (int index = arr.length - 1, newArrIndex = 0; index >= 0; index--, newArrIndex++) {
            newArr[newArrIndex] = arr[index];
        }
        return newArr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        //TODO
        for (int index = 0; index < arr.length / 2; index++) {
            int temp = arr[index];
            arr[index] = arr[arr.length - index - 1];
            arr[arr.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
