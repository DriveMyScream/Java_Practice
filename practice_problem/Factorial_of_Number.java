package practice_problem;
import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of numbers is: "+ factorial);
    }
}
