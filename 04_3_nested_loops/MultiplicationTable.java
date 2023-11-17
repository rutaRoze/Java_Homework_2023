public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.print("    ");
        for (int k = 1; k <= 9; k++) {
            System.out.print("  " + k);
        }
        System.out.println("");

        System.out.print("__ _");
        for (int z = 1; z <= 9; z++) {
            System.out.print("_ _");
        }
        System.out.println("");


        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
                int multiplicationResult = j * i;

                if (multiplicationResult <= 9) {
                    System.out.print("  " + multiplicationResult);
                } else {
                    System.out.print(" " + multiplicationResult);
                }
            }
            System.out.println("");
        }
    }
}
