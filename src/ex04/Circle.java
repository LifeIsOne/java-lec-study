package ex04;

public class Circle {
    private int radius;

    // 생성자 (생성될 때 무조건 실행되는 메서드)
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
