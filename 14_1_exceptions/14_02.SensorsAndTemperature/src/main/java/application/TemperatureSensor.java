package application;

public class TemperatureSensor implements Sensor {

    private boolean status;

    public TemperatureSensor() {
        this.status = false;

    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        status = true;
    }

    @Override
    public void setOff() {
        status = false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is off");
        }

        return (int) (-30 + (Math.random() * 61));
    }
}
