import java.util.Scanner;

public class PerimeterOfTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first edge of triangle:");
        int edge1 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the second edge of triangle:");
        int edge2 = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the third edge of triangle:");
        int edge3 = Integer.parseInt(scan.nextLine());

        int trianglePerimeter = edge1 + edge2 + edge3;

        boolean isTriangleValid = edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1;

        if (isTriangleValid) {
            System.out.println(trianglePerimeter);
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}
