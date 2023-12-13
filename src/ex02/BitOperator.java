package ex02;

public class BitOperator {
    public static void main(String[] args) {

        byte status = 0b01101110;
        System.out.print("Door open status(true or false) = " + ((status & 0b00000100) != 0));
    }
}
