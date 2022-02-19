package recursion;
import java.util.Scanner;

public class print_numbers_backtracking {
    public static void reverseNumber(int i, int num) {
        if(i<1) {
            return;
        }
        reverseNumber(i-1, num);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        reverseNumber(num, num);
    }
}
