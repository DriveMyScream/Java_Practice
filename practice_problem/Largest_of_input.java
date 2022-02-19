package practice_problem;
import java.util.Scanner;

public class Largest_of_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int max = 0;
        while (true) {
            System.out.print("Enter a Number: ");
            int num = scan.nextInt();
            if(num==0){
                break;
            }
            first = num;
            max = 0;
            if(first > max){
                max = first;
            }
        }
        System.out.println("The Largest Number amoung is: "+ max);

    }
}
