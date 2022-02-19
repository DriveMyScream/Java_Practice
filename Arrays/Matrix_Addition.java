package Arrays;
import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a [] [] = new int [3] [3];
        int b [] [] = new int [3] [3];
        int r [] [] = new int [3] [3];

        System.out.println("Enter the elements in first array: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Enter a element at index of " + i +", " + j +" is: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter the element in second array: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print("Enter a element at index of " + i +", " + j +" is: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Printing the addition of two numbers: ");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }

    }
}
