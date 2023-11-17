public class CircleSimple {
    private double radius = 1.0;

    public CircleSimple() {

    }

    public CircleSimple(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
