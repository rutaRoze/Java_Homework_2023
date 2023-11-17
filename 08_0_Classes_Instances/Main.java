public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + ".");

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + ".");

        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + ", color " + c3.getColor() + ".");

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("orange");
        System.out.println("color is: " + c4.getColor());

        Circle c5 = new Circle(5.0);
        System.out.println(c5.toString());
        System.out.println(c5);

        Employee ruta = new Employee(1, "ruta", "roze", 2);
        System.out.println(ruta.getName());

        System.out.println(ruta);

        Account ru = new Account("1", "ruta", 200);
        Account ro = new Account("2", "roze", 100);

        System.out.println(ru.transferTo(ro, 50));




    }
}
