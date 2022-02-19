package Math;
import java.util.*;

public class Even_and_Odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if((num & 1) == 0) {
            System.out.println("The Given number is even");
        } else{
            System.out.println("The Given number is odd");
        }
    }
}
