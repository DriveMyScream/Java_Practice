package recursion1;

public class Linear_Search2 {
    public static int linearSearch(int arr[], int end, int target) {
        if(end == -1) {
            return -1;
        }
        if(arr[end] == target) {
            return end;
        }
        return linearSearch(arr, end-1, target);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 20, 70, 80, 90, 100};
        int target  = 20;
        int end = arr.length-1;
        int result = linearSearch(arr, end, target);
        System.out.println(result);
    }
}
