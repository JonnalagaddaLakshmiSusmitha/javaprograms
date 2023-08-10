class Shape
{
    String color;
    double radius;
    double length;
    double width;

    public Shape(String color, double radius, double length, double width)
{
        this.color = color;
        this.radius = radius;
        this.length = length;
        this.width = width;
    }
}

class Circle extends Shape {
    public Circle(String color, double radius) {
        super(color, radius, 0, 0);
    }

    public double getArea() {
        return 3.14* radius * radius;
    }
}

class Rectangle extends Shape {
    public Rectangle(String color, double length, double width) {
        super(color, 0, length, width);
    }

    public double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5);
        System.out.println("Circle area: " + circle.getArea());

        Rectangle rectangle = new Rectangle("blue", 4, 6);
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}