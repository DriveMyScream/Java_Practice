package practice_problem;
import java.util.Scanner;

public class Calculaor_Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = scan.nextInt();
        System.out.print("Enter a second number: ");
        int b = scan.nextInt();
        System.out.print("Enter a operation you want to perform: ");
        char op = scan.next().strip().charAt(0);
        float result = 0;

        switch (op){
            case '+':
              result = a + b;
              System.out.println("The addition of two numbers is: "+ result);
              break;
            case '-':
                result = a - b;
                System.out.println("The subtraction of two numbers is: "+result);
                break;
            case '*':
                result = a * b;
                System.out.println("The multiplication of two numbers is: "+ result);
                break;
            case '/':
                if(b != 0){
                    result = a / b;
                    System.out.println("The Division of two numbers is: "+ result);
                }
                break;
            case '%':
                result = a % b;
                System.out.println("The module of two numbers is: "+ result);
                break;
        }

    }
}
