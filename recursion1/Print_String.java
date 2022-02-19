package recursion1;
import java.util.Scanner;

public class Print_String {
    public static void printString(int num) {
        if(num<=0) {
            return;
        }
        System.out.println("Hello World");
        printString(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printString(num);
    }
}
