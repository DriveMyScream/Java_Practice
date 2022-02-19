package recursion;
import java.util.*;

public class swap_array1 {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void swapArrays(int arr[], int s, int e){
        if(s >= e/2) {
            return;
        }
        swap(arr, arr[s], arr[e-s-1]);
        swapArrays(arr, s+1, e);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int s = 0;
        int e = arr.length-1;
        swapArrays(arr, s, e);
        System.out.println(Arrays.toString(arr));
    }
}
