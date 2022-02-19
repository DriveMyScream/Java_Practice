package Arrays;

public class Sum_of_Element_in_Array {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements in array is: "+ sum);
    }
}
