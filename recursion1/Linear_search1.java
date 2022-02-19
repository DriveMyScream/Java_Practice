package recursion1;

public class Linear_search1 {
    public static boolean isPresent(int arr[], int start, int target) {
        if(start == arr.length-1) {
            return false;
        }
        return arr[start] == target || isPresent(arr, start+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int start = 0;
        int target = 90;
        boolean result = isPresent(arr, start, target);
        System.out.println(result);
    }
}
