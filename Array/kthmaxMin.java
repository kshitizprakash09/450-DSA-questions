package Array;

import java.util.Arrays;

public class kthmaxMin {

    // main function
    public static void main(String[] args) {

        // arr
        int[] arr = { 10, 4, 6, 20, 50, 40 };
        int k = 3;
        int n = arr.length;

        System.out.println();
        System.out.println("Print original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        // sort the array
        Arrays.sort(arr);

        System.out.println();
        System.out.println("Print sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println(" kth max element : " + arr[n - k]);
        System.out.println(" kth min element : " + arr[k - 1]);
    }
}
