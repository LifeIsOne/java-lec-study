package ex03.test;

import java.util.Arrays;

public class BublbleTest01 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        int temp;

        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
