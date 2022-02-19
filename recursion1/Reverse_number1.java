package recursion1;
import java.util.Scanner;

public class Reverse_number1 {
    public static int reverse(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    private static int helper(int n, int digit) {
        if(n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = reverse(num);
        System.out.println(result);

    }
}
