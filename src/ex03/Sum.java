package ex03;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 10; i++)
            sum += i;   // sum에 i를 더하고(+) 그 값을 넣기(=)

        System.out.println("Sum of integers from 1 to 10 : " + sum);
    }
}
