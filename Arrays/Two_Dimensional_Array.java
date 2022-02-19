package Arrays;
import java.util.Scanner;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] [] = new int [3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Enter a element at index of " + i +", " + j + " : " );
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Printing the element in arrays: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
