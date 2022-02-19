package practice_problem;
import java.util.Scanner;

public class Pythagorean_triple {
    public static int Square(int num) {
        int result = num * num;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a third number: ");
        int num3 = sc.nextInt();

        int a = Square(num1);
        int b = Square(num2);
        int c = Square(num3);
        int result1 = a + b;
        int result2 = c;

        if(result1 == result2) {
            System.out.println("The Given Number is Pythagoren triple");
        } else{
            System.out.println("The Given Number is Not a Pythagoren triple");
        }
    }
}
