package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {

        ArrayList<Boolean> isAllSensorOn = new ArrayList<>();

        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                isAllSensorOn.add(true);
            }
        }

        if (isAllSensorOn.size() == sensors.size()) {
            return true;
        }

        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.size() == 0) {
            throw new IllegalStateException("Sensors are off");
        }

        int average = (int) sensors.stream().mapToInt(s -> s.read()).average().orElse(0.0);
        readings.add(average);
        return average;
    }

    public List<Integer> readings() {

        return readings;
    }
}
