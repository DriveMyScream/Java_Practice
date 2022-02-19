package conditionals_and_loops;
import java.util.Scanner;

public class while_loop {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int firstNum = 1;
        while(firstNum <= num){
            System.out.print(firstNum + " ");
            firstNum = firstNum + 1;
        }
    }
}
