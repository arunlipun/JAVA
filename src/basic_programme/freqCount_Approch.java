package basic_programme;

import java.util.Arrays;

public class freqCount_Approch {

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int n = arr.length;


        frequencyCount(arr, n);

        System.out.println(Arrays.toString(arr));
    }

    static void frequencyCount(int[] arr, int n) {

        // Convert to 0-based indexing
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - 1;
        }

        // Store frequency using modulo
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }

        // Extract frequency
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}