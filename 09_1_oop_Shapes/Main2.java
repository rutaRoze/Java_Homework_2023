import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(1, 2);
        Square sq = new Square(5);

        ArrayList<Rectangle> shapes = new ArrayList<>();

        shapes.add(rec);
        shapes.add(sq);

        for (Rectangle shape : shapes) {

            shape.setWidth(8);
            shape.setWidth(11);
            shape.setLength(9);

        }


    }
}
