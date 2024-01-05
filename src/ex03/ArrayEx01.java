package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 5000번지 + 4(int크기)x3(갯수) - 1 = arr의 마지막 주소(5011)

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i <=2 ; i++)
            System.out.println(arr[i]);
    }
}
