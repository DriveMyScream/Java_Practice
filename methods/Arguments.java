package methods;
import datatype_and_variable.Sumofnumbers;

import java.util.Scanner;

public class Arguments {
    public static int Sumofnumbers(int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();

        int result = Sumofnumbers(a, b);
        System.out.println("The Sum of two numbers is: "+ result);

    }
}
