package recursion;
import java.util.Scanner;

public class print_reverse_numbers {
    public static void reversePrint(int num) {
        if(num<1) {
            return;
        }
        System.out.println(num);
        reversePrint(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        reversePrint(num);
    }
}
