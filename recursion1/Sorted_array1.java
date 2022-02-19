package recursion1;

public class Sorted_array1 {
    public static boolean isSorted(int arr[], int start) {
        if(start == arr.length-1) {
            return true;
        }
        return arr[start] < arr[start+1] && isSorted(arr, start+1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 700, 80, 90, 100};
        int start = 0;
        boolean result = isSorted(arr, start);
        System.out.println(result);
    }
}
