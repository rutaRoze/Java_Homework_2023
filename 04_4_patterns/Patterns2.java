public class Patterns2 {

    public static void main(String[] args) {

        int size = 7;

        // 1st pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                //top and bottom borders
                if (row == 1 || row == size) {
                    System.out.print("# ");
                //left and right border
                } else if (col == 1 || col == size) {
                    System.out.print("# ");
                //spaces in the middle
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //2nd pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                //top and bottom borders
                if (row == 1 || row == size) {
                    System.out.print("# ");
                //line form left top conner to right bottom corner
                } else if (row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //3rd pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                //top and bottom borders
                if (row == 1 || row == size) {
                    System.out.print("# ");
                //line form left top conner to right bottom corner AND from right top to left bottom corner
                } else if (row == col || row + col == size + 1) {
                    System.out.print("# ");
                //spaces
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //4th pattern
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                //top and bottom borders
                if (row == 1 || row == size) {
                    System.out.print("# ");
                //left and right border
                } else if (col == 1 || col == size) {
                    System.out.print("# ");
                //line form left top conner to right bottom corner AND from right top to left bottom corner
                } else if (row == col || row + col == size + 1) {
                    System.out.print("# ");
                //spaces
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
