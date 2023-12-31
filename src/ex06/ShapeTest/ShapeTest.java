package ex06.ShapeTest;

class Shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
    private int width, height;

    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape {
    private int base, height;

    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape {
    private int radius;

    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1, s2;

        s1 = new Shape();       // 당연
        s2 = new Rectangle();   // Rectangle 객체를 Shape 변수로 가르킬 수 있을까
    }
}
