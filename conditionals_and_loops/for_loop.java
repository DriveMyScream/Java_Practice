package conditionals_and_loops;
import java.util.Scanner;

public class for_loop {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print(i + " ");
        }
    }
}
