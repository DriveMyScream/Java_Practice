package recursion1;
import java.util.Scanner;

public class Reverse_number {
    static int sum = 0;
    public static void reverseNumber(int num) {
        if(num == 0) {
            return;
        }
        int digit = num % 10;
        sum = sum * 10 + digit;
        reverseNumber(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        reverseNumber(num);
        System.out.println(sum);
    }
}
