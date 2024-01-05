package ex05;

public class Test {
    public static int cube(int x){
        int result = x*x*x;
        return result;
    }
    static int number;
    static String s;
    static {
        number = 23;
        s = "Hello Life";
    }

    public static void main(String[] args) {
        System.out.println("10*10*10은? " + cube(10));
        System.out.println("int number : " + number);
        System.out.println("String s : " + s);
    }
}
