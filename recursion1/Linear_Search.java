package recursion1;

public class Linear_Search {
    public static int linearSearch(int arr[], int start, int target) {
        if (start == arr.length - 1) {
            return -1;
        }
        if(arr[start] == target) {
            return start;
        }
        return linearSearch(arr, start+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int start = 0;
        int target = 90;
        int index = linearSearch(arr, start, target);
        System.out.println(index);
    }
}
