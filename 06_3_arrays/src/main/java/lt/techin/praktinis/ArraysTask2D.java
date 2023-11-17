package lt.techin.praktinis;

public class ArraysTask2D {

    public static void main(String[] args) {

        // (Papildomai) Įgyvendikite visus metodus (turi pažaliuoti unit testai).
        //  Pateiktas dvimatis masyvas programos patikrinimui. Elementų reikšmes galite keisti.

        int[][] marks = {
                {6, 4, 7},
                {0, 1, 2},
                {1, 4, 4},
                {4, 4, 5}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    // 2D arrays some theory:
    // https://www.cs.cmu.edu/~mrmiller/15-110/Handouts/arrays2D.pdf
    // https://simplycoding.in/2d-array-in-java/
    public static double getAverageMark(int[][] marks) {
        //TODO
        int sum = 0;
        int count = 0;
        for (int rowIndex = 0; rowIndex < marks.length; rowIndex++) {
            int[] columns = marks[rowIndex];
            for (int columnIndex = 0; columnIndex < columns.length; columnIndex++) {
                sum = sum + columns[columnIndex];
                count++;
            }
        }

        double average = (double) sum / count;
        return (int) (average * 100 + 0.5) / 100.0;
    }

    public static int getMinMark(int[][] marks) {
        //TODO
        int minMark = 999999;
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                if (marks[row][col] < minMark) {
                    minMark = marks[row][col];
                }
            }
        }
        return minMark;
    }

    public static int getMaxMark(int[][] marks) {
        //TODO
        int maxMark = 0;
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                if (marks[row][col] > maxMark) {
                    maxMark = marks[row][col];
                }
            }
        }
        return maxMark;
    }
}
