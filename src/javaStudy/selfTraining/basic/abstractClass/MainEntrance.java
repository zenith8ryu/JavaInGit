package javaStudy.selfTraining.basic.abstractClass;

public class MainEntrance {
    public static void main(String[] args) {
        System.out.println(new Circle(1, 2, 3, 4).getPerimeter());
        System.out.println(new Rectangle(1, 1, 2, 3).getArea());
    }
}

abstract class Shape {
    int x, y;
    int width, height;

    Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends Shape {
    double r;

    public Circle(int x, int y, int width, int heigh) {
        super(x, y, width, heigh);
        r = (double) width / 2.0;
    }

    public double getArea() {
        return (r * r * Math.PI);
    }

    public double getPerimeter() {
        return (2 * Math.PI * r);
    }
}

class Rectangle extends Shape {

    Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}