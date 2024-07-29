package shape;

public class Circle implements Shape {
    private double radius;
    private static final double PI = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
