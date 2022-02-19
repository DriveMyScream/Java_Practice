package recursion;
import java.util.Scanner;

public class sum_of_numbers {
    public static void sumNumbers(int num, int sum) {
        if(num<1) {
            System.out.println(sum);
            return;
        }
        sumNumbers(num-1, sum+num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        sumNumbers(num, sum);

    }
}
