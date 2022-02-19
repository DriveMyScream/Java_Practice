package methods;

import java.util.Arrays;

public class Pass_by_reference_of_first_variable {
    public static void ChangeValue(int [] num) {
        num[0] = 100;
        num[1] = 200;
        num[2] = 300;
        num[3] = 400;
    }
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        ChangeValue(arr);

        // Approach 1:
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Approach 2:
        System.out.println(Arrays.toString(arr));

        // Approach 3:
        for(int element: arr) {
            System.out.print(element + " ");
        }
    }
}
