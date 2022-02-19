package recursion1;
import java.util.*;

public class Linear_Search5 {
    public static ArrayList linearSearch(int arr[], int start, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(start == arr.length-1) {
            return list;
        }
        if(arr[start] == target) {
            list.add(start);
        }
        ArrayList<Integer> ansOfBelowCalls = linearSearch(arr, start+1, target);
        list.addAll(ansOfBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 90, 90, 90, 50, 60, 70, 80, 90};
        int start = 0;
        int target = 90;
        ArrayList<Integer> ans = linearSearch(arr, start, target);
        System.out.println(ans);
     }
}
