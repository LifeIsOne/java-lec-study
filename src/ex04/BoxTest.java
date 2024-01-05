package ex04;

class Box{
    int width, depth;
    int length;
    int height;
    double getVoume() {         return (double) width * height * length; }
}

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.printf("상자의 가로 : %d, 세로 : %d, 높이 : %d\n",
                                        b.width, b.length, b.height);
        System.out.println("상자의 부피는 " + b.getVoume() + "입니다.");

    }
}

