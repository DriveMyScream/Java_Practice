package recursion1;
import java.util.Scanner;

public class Product_of_Digits {
    public static int productOfDigit(int num) {
        if(num % 10 == num) {
            return num;
        }
        return (num % 10) * productOfDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = productOfDigit(num);
        System.out.println(result);

    }
}
