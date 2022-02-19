package practice_problem;
import java.util.Scanner;

public class Infinite_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.print("Enter a first number: ");
            int a = sc.nextInt();
            System.out.print("Enter a second number: ");
            int b = sc.nextInt();
            System.out.print("Enter a operation: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if(op == '+') {
                    result = a + b;
                }
                if(op == '-') {
                    result = a - b;
                }
                if(op == '*') {
                    result = a * b;
                }
                if(op == '/') {
                    if(b != 0) {
                        result = a / b;
                    }
                }
                if(op == '%') {
                    result = a % b;
                }
            } else if(op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("The Operation is failed");
            }
            System.out.println("The Result is: "+ result);
        }
    }
}
