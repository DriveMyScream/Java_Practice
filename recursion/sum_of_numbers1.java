package recursion;
import java.util.Scanner;

public class sum_of_numbers1 {
    public static int sumNumbers(int num) {
        if(num == 0) {
            return 0;
        }
        return num + sumNumbers(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sumNumbers(num);
        System.out.println(result);
    }
}
