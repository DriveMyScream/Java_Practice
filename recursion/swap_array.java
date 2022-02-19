package recursion;
import java.util.*;

public class swap_array {
    public static void swapNumbers(int arr[], int n, int m) {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
    public static void swapArray(int arr[], int n, int m) {
        if(n>=m) {
            return;
        }
        swapNumbers(arr, n, m);
        swapArray(arr, n+1, m-1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int in = 0;
        int len = arr.length-1;
        swapArray(arr, in, len);
        System.out.println(Arrays.toString(arr));


    }
}
