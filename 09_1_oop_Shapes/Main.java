import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        Circle apskritimas = new Circle(6);
        Shape staciakampis = new Rectangle(5, 3);
        Square kvadratas = new Square(3);

//        System.out.println(apskritimas);
//        System.out.println(staciakampis);
//        System.out.println(kvadratas);

        shapes.add(apskritimas);
        shapes.add(staciakampis);
        shapes.add(kvadratas);

        System.out.println();

        //1. print shapes
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println();

        //2. Print all shapes area

        //ArrayList<Double> areaOfShapes = new ArrayList<>();

        double sumArea = 0;

        for (Shape shape : shapes) {

            sumArea += shape.getArea();

/*            if(shape instanceof Circle){
                Circle c = (Circle) shape;
                sumArea + = c.getArea();
            }*/

        }
        System.out.println(sumArea);

        //3. shape with the greatest perimeter

        System.out.println();

        double greatestPerimeter = 0;
        String shapeName = "";
        for (Shape shape : shapes) {

            if (shape.getPerimeter() > greatestPerimeter) {
                greatestPerimeter = shape.getPerimeter();
                shapeName = shape.toString();
            }

        }
        System.out.println("The greatest perimeter of " + greatestPerimeter + " has: " + shapeName);

        System.out.println();

        //4. print only square sides

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.getSide());
            }
        }

//        double squareSide = kvadratas.getSide();
//        System.out.println(squareSide);

    }
}
