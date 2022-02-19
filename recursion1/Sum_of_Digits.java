package recursion1;
import java.util.Scanner;

public class Sum_of_Digits {
    public static int sumOfDigits(int fullnum) {
        if(fullnum == 0) {
            return fullnum;
        }
        int digit = fullnum % 10;
        return digit + sumOfDigits(fullnum/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println(result);
    }
}
