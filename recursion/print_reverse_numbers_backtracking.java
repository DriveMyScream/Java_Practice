package recursion;
import java.util.Scanner;

public class print_reverse_numbers_backtracking {
    public static void reverseNumner(int i, int num) {
        if(i>num){
            return;
        }
        reverseNumner(i+1, num);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        reverseNumner(1, num);
    }
}
