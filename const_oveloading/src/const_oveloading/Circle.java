package const_oveloading;

public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());
    }
}
