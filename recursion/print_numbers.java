package recursion;
import java.util.Scanner;

public class print_numbers {
    public static void printNumbers(int i, int num) {
        if(i > num) {
            return;
        }
        System.out.println(i);
        printNumbers(i+1, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        printNumbers(1, num);
    }
}
