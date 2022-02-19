package Arrays;

public class Minimum_Element {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 5};
        int min = 0;
        for(int i=0; i<arr.length; i++) {
            min = arr[i];
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The Minimum element in array is: " + min);
    }
}
