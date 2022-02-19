package recursion1;

public class Sorted_array {
    public static boolean isSorted(int arr[], int start) {
        if(start == arr.length-1) {
            return true;
        }
        if(arr[start] > arr[start+1]) {
            return false;
        }
        return isSorted(arr, start+1);
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 600, 7, 8, 90, 100};
        int start = 0;
        boolean result = isSorted(arr, start);
        System.out.println(result);

    }
}
