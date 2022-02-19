package recursion1;
import java.util.Scanner;

public class Sum_of_numbers {
    public static int sumOfNumbers(int num) {
        if(num == 0) {
            return num;
        }
        return num + sumOfNumbers(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sumOfNumbers(num);
        System.out.println(result);
    }
}
