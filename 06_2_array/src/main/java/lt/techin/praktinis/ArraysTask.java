package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5, 9, 11};

        int firstEl = getFirstElement(arr);
        System.out.println(firstEl);
        int lasEl = getLastElement(arr);
        System.out.println(lasEl);
        double average = getAverage(arr);
        System.out.println(average);


        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        //TODO
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        //TODO
        return arr[arr.length - 1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        //TODO
        int min = 9999999;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        //TODO
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        //TODO
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        //TODO
        int count = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
            count++;
        }
        double average = 1.00 * sum / count;
        return (int) (average * 100 + 0.5) / 100.0;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        int count = 0;
        for (int num : arr) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        boolean containsNumber = false;
        for (int num : arr) {
            if (num == n) {
                containsNumber = true;
                break;
            }
        }
        return containsNumber;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        int lastIndex = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == n) {
                lastIndex = index;
            }
        }
        return lastIndex;
    }
}
