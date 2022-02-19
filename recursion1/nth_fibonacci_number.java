package recursion1;
import java.util.Scanner;

public class nth_fibonacci_number {
    public static int fibonacci(int num){
        if(num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }
}
