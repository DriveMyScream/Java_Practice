package recursion1;
import java.util.Scanner;

public class Print_numbers3 {
    public static void printNumbers(int num) {
        if(num == 0) {
            return;
        }
        System.out.println(num);
        printNumbers(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printNumbers(num);
    }
}
