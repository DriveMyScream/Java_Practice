package practice_problem;
import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=2; i<=num; i++){
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }
}
