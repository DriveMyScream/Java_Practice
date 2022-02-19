package recursion;
import java.util.Scanner;

public class print_name {
    public static void printName(int i, int num, String name) {
        if(i>num) {
            return;
        }
        System.out.println(i + ":" + name);
        printName(i+1, num, name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of times: ");
        int num = sc.nextInt();
        System.out.print("Enter a Name: ");
        String name = sc.next();
        printName(1, num, name);
    }
}
