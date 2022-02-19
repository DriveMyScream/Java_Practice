package Arrays;
import java.util.Arrays;

public class Array_Creation {
    public static void main(String[] args) {
        int arr [] = new int [5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int a [] = {100, 200, 300, 400, 500};

        // Approach 1:
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Approach 2:
        for(int element: a){
            System.out.print(element + " ");
        }

        System.out.println();

        // Approach 3:
        System.out.println(Arrays.toString(arr));
    }
}
