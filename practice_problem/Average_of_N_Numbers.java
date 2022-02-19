package practice_problem;
import java.util.Scanner;

public class Average_of_N_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.print("Enter a Number: ");
            int num = scan.nextInt();
            if(num == 0){
                break;
            }
            count = count + 1;
            sum = sum + num;
        }
        int average = sum / count;
        System.out.println("The average count of numbers is: "+ average);
    }
}
