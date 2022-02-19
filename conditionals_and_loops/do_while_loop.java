package conditionals_and_loops;
import java.util.Scanner;

public class do_while_loop {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int firstNum = 1;
        do {
            System.out.print(firstNum + " ");
            firstNum = firstNum + 1;
        } while(firstNum <= num);
    }
}
