import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the first integer:");
        int num1 = Integer.parseInt(scan.nextLine());

        System.out.println("Write the second integer:");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println("Write the third integer:");
        int num3 = Integer.parseInt(scan.nextLine());

        int smallestNum = 0;
        int middleNum = 0;
        int biggestNum = 0;

        if (num1 < num2 && num2 < num3) {
            smallestNum = num1;
            middleNum = num2;
            biggestNum = num3;
        } else if (num3 < num2 && num3 > num1) {
            smallestNum = num1;
            middleNum = num3;
            biggestNum = num2;
        }else if (num2 < num1 && num1 < num3) {
            smallestNum = num2;
            middleNum = num1;
            biggestNum = num3;
        } else if (num2 < num1 && num2 < num3) {
            smallestNum = num2;
            middleNum = num3;
            biggestNum = num1;
        } else if (num2 < num1 && num3 < num2) {
            smallestNum = num3;
            middleNum = num2;
            biggestNum = num1;
        }  else {
            smallestNum = num3;
            middleNum = num1;
            biggestNum = num2;
        }

        System.out.printf("%d, %d, %d", smallestNum, middleNum, biggestNum);


//        if (num1 < num2 && num1 < num3) {
//            smallestNum = num1;
//
//            if (num2 < num3) {
//                middleNum = num2;
//                biggestNum = num3;
//            } else {
//                middleNum = num3;
//                biggestNum = num2;
//            }
//
//        } else if (num2 < num1 && num2 < num3) {
//            smallestNum = num2;
//
//            if (num1 < num3) {
//                middleNum = num1;
//                biggestNum = num3;
//            } else {
//                middleNum = num3;
//                biggestNum = num2;
//            }
//
//        } else if (num3 < num1 && num3 < num2) {
//            smallestNum = num3;
//
//            if (num1 < num2) {
//                middleNum = num1;
//                biggestNum = num2;
//            } else {
//                middleNum = num2;
//                biggestNum = num1;
//            }
//
//        }
//        System.out.printf("%d, %d, %d", smallestNum, middleNum, biggestNum);
    }
}
