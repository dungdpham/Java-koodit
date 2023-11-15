public class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height + " and color " + getColor();
    }
}
