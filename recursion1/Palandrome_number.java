package recursion1;
import java.util.Scanner;

public class Palandrome_number {
    public static int reverse(int num) {
        int digit = (int) (Math.log10(num)) + 1;
        return helper(num, digit);
    }
    private static int helper(int n, int digit) {
        if(n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
    public static boolean isPalandrome(int n) {
        return n == reverse(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPal = isPalandrome(num);
        System.out.println(isPal);
    }
}
