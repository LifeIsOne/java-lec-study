package ex03.test;

import java.util.Scanner;

public class BinaryTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("정수를 입력하세요 (1~9) : ");
        int target = sc.nextInt();
        int count = 1;
        int start = 0;
        int end = arr.length-1;
        int mid;

        for (;; count++) {
            mid = (start+end)/2;
            if (arr[mid] == target)
                break;
            else if (arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }

        System.out.printf("정수는 %d번지에 있습니다.\n", mid);
        System.out.printf("비교 회수 : %d", count);
    }
}
