package recursion1;
import java.util.*;

public class Linear_Search4 {
    public static ArrayList linearSearch(int arr[], int start, int target, ArrayList<Integer> list) {
        if(start == arr.length-1) {
            return list;
        }
        if(arr[start] == target) {
            list.add(start);
        }
        return linearSearch(arr, start+1, target, list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[] = {90, 20, 30, 40, 90, 50, 60, 70, 80, 90, 100};
        int start = 0;
        int target = 90;
        ArrayList<Integer> ans = linearSearch(arr, start, target, list);
        System.out.println(ans);
    }
}
