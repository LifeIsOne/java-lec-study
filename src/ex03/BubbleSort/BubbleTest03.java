package ex03.BubbleSort;
// 스왑하기, temp
public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {4, 3};
        int temp;

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0]+" "+arr[1]);
    }
}
