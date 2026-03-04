package basic_programme;

import java.util.Arrays;

public class Rotate_arry {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        rotateRight(arr, 2);
//
//        System.out.println(Arrays.toString(arr));
//        rotateLeft(arr, 2);
//        System.out.println(Arrays.toString(arr));

//        ===============
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));

    }
//    ==========this is o(n) space is o(1)

//    public static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    public static void rotateRight(int[] arr, int k) {
//
//        int n = arr.length;
//        k = k % n;  // Important if k > n
//
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//    }
//
//    public static void rotateLeft(int[] arr, int k) {
//
//        int n = arr.length;
//        k = k % n;
//
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//        reverse(arr, 0, n - 1);
//    }


//    ==============using simple while loop===========
    static void rotate(int[] arr,int k){
        int i=0,j=k-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=k;j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;

        }
         i=0;
        int n=arr.length;
                j= n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;

        }
    }
}
