public class Patterns3 {

    public static void main(String[] args) {

        int size = 8;

        //1st pattern
        for (int row = 1; row <= size; row++) {
            //decreasing triangle with spaces
            for (int col = row; col < size; col++) {
                System.out.print("  ");
            }

            //increasing triangle with numbers
            for (int col = 1; col < row; col++) {
                System.out.print(col + " ");
            }

            //increasing triangle with numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        System.out.println();

        //2nd pattern
        for (int row = 1; row <= size; row++) {

            //increasing triangle with numbers
            for (int col = 1; col <= row; col++) {
                //printing numbers excluding 8th column
                if (col != size) {
                    System.out.print(col + " ");
                }
            }

            //decreasing triangle with spaces
            for (int col = row; col < size - 1; col++) {
                System.out.print("  ");
            }

            //decreasing triangle with spaces
            for (int col = row; col < size; col++) {
                System.out.print("  ");
            }

            //increasing triangle with numbers starting from 1 to 8 (numbers are printed in decreasing way)
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        System.out.println();

        //3rd pattern
        for (int row = 1; row <= size; row++) {

            //decreasing triangle with tabs
            for (int col = row; col < size; col++) {
                System.out.print("\t");
            }

            //increasing triangle with numbers, starting with 1 to <8
            int multiplication = 1;
            for (int col = 1; col < row; col++) {
                System.out.print("\t" + multiplication);
                multiplication = multiplication * 2;
            }

            //increasing triangle with numbers, starting with 1 to 8 (numbers are printed in decreasing way)
            int multiplication2 = multiplication;
            for (int col = row; col >= 1; col--) {
                System.out.print("\t" + multiplication2);
                multiplication2 = multiplication2 / 2;
            }

            System.out.println();
        }
    }
}
