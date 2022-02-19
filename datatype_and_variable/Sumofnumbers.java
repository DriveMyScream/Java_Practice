package datatype_and_variable;
import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("The Sum of two numbers is: "+ result);



    }
}
