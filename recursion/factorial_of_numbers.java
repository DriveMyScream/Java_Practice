package recursion;
import java.util.Scanner;

public class factorial_of_numbers {
    public static void factorial(int num, int product) {
        if(num < 1) {
            System.out.println(product);
            return;
        }
        factorial(num-1, num*product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;
        factorial(num, product);

    }
}
