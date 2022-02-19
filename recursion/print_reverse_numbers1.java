package recursion;
import java.util.Scanner;

public class print_reverse_numbers1 {
    public static void reverseNumber(int i, int num) {
        if(i<1){
            return;
        }
        System.out.println(i);
        reverseNumber(i-1, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        reverseNumber(num, num);
    }
}
