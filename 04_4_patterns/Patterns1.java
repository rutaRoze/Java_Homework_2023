public class Patterns1 {

    public static void main(String[] args) {

        // 1
        int size = 8;
        for (int row = 1; row <= size; row++) {
            //decreasing triangle with #
            for (int col = row; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        // 2
        int size2 = 8;
        for (int row = 1; row <= size2; row++) {
            //increasing triangle with spaces
            for (int col = 1; col < row; col++) {
                System.out.print("  ");
            }
            //decreasing triangle with #
            for (int col = row; col <= size2; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }

        System.out.println();

        // 3
        int size3 = 8;
        for (int i = 1; i <= size3; i++) {
            //increasing triangle with numbers starting from 1 to 8 (numbers are printed in decreasing way)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 4
        int size4 = 8;
        for (int i = 1; i <= size4; i++) {
            //decreasing triangle with spaces
            for (int j = i; j <= size4; j++) {
                System.out.print("  ");
            }

            //increasing triangle with numbers starting from 1 and increasing every iteration by 1 until 8
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }

            System.out.println();
        }

    }
}
