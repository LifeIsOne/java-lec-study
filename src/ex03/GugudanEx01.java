package ex03;

public class GugudanEx01 {
    public static void main(String[] args) {

        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 9; i++)
                System.out.printf("%d X %d = %d\n",j, i, j * i);
            System.out.println("==========");
        }
    }
}
