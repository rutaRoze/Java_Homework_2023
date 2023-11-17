import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> statuses = new ArrayList<>();

    public ChangeHistory() {

    }

    public void add(double status) {
        this.statuses.add(status);
    }

    public void clear() {
        this.statuses.clear();
    }

    public double maxValue() {
        if (statuses.isEmpty()) {
            return 0;
        }

        return Collections.max(statuses);
    }

    public double minValue() {
        if (statuses.isEmpty()) {
            return 0;
        }

        return Collections.min(statuses);
    }

    public double average() {
        if (statuses.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Double status : statuses) {
            sum += status;
        }

        double average = sum / statuses.size();

        return average;
    }


    public String toString() {

//        String output = "";
//        for (Double status : statuses) {
//            output += status + "\n";
//        }
//        return output;

        return statuses.toString();
    }

}
