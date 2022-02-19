package recursion;
import java.util.Scanner;

public class multiplication_of_numbers {
    public static int product(int n, int m) {
        if(n<m) {
            product(m, n);
        }
        else if(m != 0) {
            return (n + product(n, m-1));
        }
        else {
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        int result = product(a, b);
        System.out.println(result);

    }
}
