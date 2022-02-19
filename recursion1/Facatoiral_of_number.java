package recursion1;
import java.util.Scanner;

public class Facatoiral_of_number {
    public static int factorial(int num) {
        if(num==1) {
            return num;
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
