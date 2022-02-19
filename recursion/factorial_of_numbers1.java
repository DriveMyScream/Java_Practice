package recursion;
import java.util.Scanner;

public class factorial_of_numbers1 {
    public static int factorial(int num){
        if(num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }
}
