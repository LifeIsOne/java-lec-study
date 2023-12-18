package ex03;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 4, 3};
        final int N = arr.length;

        for (int rep = 0; rep < N-1; rep++) {
            int min = rep;

            for (int i = rep + 1; i < N; i++) {
                if (arr[min] > arr[i])
                    min = i;
            }
            if ((rep) != min) {
                int temp = arr[rep];
                arr[rep] = arr[min];
                arr[min] = temp;
            }
        }
        for (int i = 0; i < N; i++)
            System.out.println(arr[i]);
        for (int v : arr)
            System.out.print(v + " ");
    }
}
