class Shape{
    public int getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius); 
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return length * breadth;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());
    }
}