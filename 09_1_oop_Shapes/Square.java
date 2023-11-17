public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        //setSide(side);

//        super.setLength(side);
//        super.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

//        super.setWidth(side);
//        super.setLength(side);
//        super.setColor(color);
//        super.setFilled(filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    public String toString() {
        return "A Square with side = " + getSide() +
                ", which is a subclass of " + super.toString();
    }


}
