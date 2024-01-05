package ex06;

class Box{
    int length, width, height;
    int Volume(){
        return length*width*height;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

public class whatThe {
    public static void main(String[] args) {
        Box bx = new Box(4,5,10);


        System.out.println(bx.Volume());
    }
}
