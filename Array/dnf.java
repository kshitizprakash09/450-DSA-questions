package Array;

import java.util.Arrays;

public class dnf {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 0, 2, 1, 2, 0 };
        System.out.println("Print original array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println();
        // print thr sorted array
        System.out.println("Print sorted array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
