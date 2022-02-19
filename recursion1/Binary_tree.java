package recursion1;

public class Binary_tree {
    public static int search(int arr[], int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]) {
            return mid;
        }
        if(target < arr[mid]) {
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int start = 0;
        int end = arr.length-1;
        int target = 80;
        int result = search(arr, target, start, end);
        System.out.println(result);
    }
}
