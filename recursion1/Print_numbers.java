package recursion1;
import java.util.Scanner;

public class Print_numbers {
    public static void printNumbers(int end) {
        if(end<=0){
            return;
        }
        System.out.println(end);
        printNumbers(end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ini = 0;
        printNumbers(num);
    }
}
