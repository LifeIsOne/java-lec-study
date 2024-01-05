package ex03;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] s = new int[10];      // int 자료형 크기 10개 생성

        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
