package ex03.test;
// 비교해서 크면 스왑하기
public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        final int N = arr.length;
        // java와의 약속 : fianal이 붙은 변수는 이제 상수니까 대문자로 쓰자
        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N-1)-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

    }
}
