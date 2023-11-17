
public class Greatest {

    public static int greatest(int num1, int num2, int num3) {
        //write some code here

        int greatest = 0;
        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num1 && num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
