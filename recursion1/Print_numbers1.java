package recursion1;
import java.util.Scanner;

public class Print_numbers1 {
    public static void printNumbers(int start, int end) {
        if(start == end){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printNumbers(start+1, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int start = 1;
        printNumbers(start, num);


    }
}
