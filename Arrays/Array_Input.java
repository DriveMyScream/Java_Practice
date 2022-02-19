package Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int [5];
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter a element at index " + i +" is: ");
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
