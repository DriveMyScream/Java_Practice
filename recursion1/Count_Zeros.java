package recursion1;
import java.util.Scanner;

public class Count_Zeros {
    public static int number = 0;
    public static void countZeros(int num) {
        if(num <= 0) {
            return;
        }
        int digit = num % 10;
        if(digit == 0) {
            number = number + 1;
        }
        countZeros(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        countZeros(num);
        System.out.println(number);
    }

}
