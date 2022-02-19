package recursion1;
import java.util.*;

public class Linear_Search3 {
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearch(int arr[], int start, int target) {
        if(start == arr.length-1) {
            return;
        }
        if(arr[start] == target) {
            list.add(start);
        }
        linearSearch(arr, start+1, target);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 70, 50, 60, 70, 70, 80, 90, 100};
        int start = 0;
        int target = 80;
        linearSearch(arr, start, 70);
        System.out.println(list);
    }

}
