package Arrays;

public class Sorted_Array {
    public static void main(String[] args) {
        boolean isSorted = true;
        int arr [] = {10, 20, 30, 400, 50, 60, 70, 80, 90, 100};
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
            }

        }
        if(isSorted == true) {
            System.out.println("the givem array is sorted");
        } else{
            System.out.println("The given array is not sorted");
        }
    }
}
