import java.text.DecimalFormat;

public class Clock {

    public static void main(String[] args) {

        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                if (hours <= 9 && minutes <= 9) {
                    System.out.println("0" + hours + ":" + "0" + minutes);
                } else if (hours <= 9) {
                    System.out.println("0" + hours + ":" + minutes);
                } else if (minutes <= 9) {
                    System.out.println(hours + ":" + "0" + minutes);
                } else {
                    System.out.println(hours + ":" + minutes);
                }
            }
        }

//        DecimalFormat formatter = new DecimalFormat("00");
//
//        for (int hours = 0; hours <= 23; hours++) {
//            for (int minutes = 0; minutes <= 59; minutes++) {
//                System.out.println(formatter.format(hours) + ":" +
//                        formatter.format(minutes));
//            }
//        }

    }
}
