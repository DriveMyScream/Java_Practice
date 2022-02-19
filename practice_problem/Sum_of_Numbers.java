package practice_problem;
import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            if(num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println("The Sum of you enter number is: "+ sum);
    }
}
