package ex06;

class Shape {
    int x, y;

    public Shape(){
        System.out.println("Shape 생성됨.");
    }
}

class Circle extends Shape{
    int radius;     // 반지름

    public Circle(int radius) {
        System.out.println("Circle 생성됨.");
        this.radius = radius;
        System.out.println("1");
        super.x = 0;
        super.y = 0;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("원의 중심 : (" + circle.x +  "," + circle.y + ")");
        System.out.println("원의 면적 : " + circle.getArea());
    }
}
