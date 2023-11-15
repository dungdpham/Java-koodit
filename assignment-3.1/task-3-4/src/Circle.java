public class Circle extends Shape {
    private double radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " and color " + getColor();
    }
}
