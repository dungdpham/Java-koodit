import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5, "Red"));
        shapes.add(new Rectangle(4, 6, "Blue"));
        shapes.add(new Triangle(3, 8, "Green"));

        for(Shape shape: shapes) {
            System.out.println("Area of " + shape.toString() + ": " + shape.calculateArea());
        }
    }
}
