public class WeeksAndDays {

    public static void main(String[] args) {

        int weekNumber = 4;
        int weekDayNumber = 7;

        for (int i = 1; i <= weekNumber; i++) {
            System.out.println("Week " + i);

            for (int y = 1; y <= weekDayNumber; y++) {
                System.out.println("       Day " + y);
            }
        }

    }
}
