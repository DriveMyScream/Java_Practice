package practice_problem;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int temp = num;
        int num1 = 0;
        int sum = 0;
        while(temp != 0){
            num1 = temp % 10;
            sum = sum + (num1 * num1 * num1);
            temp = temp / 10;
        }
        System.out.println(sum);
        if(num == sum){
            System.out.println("The Given number is armstrong");
        } else{
            System.out.println("The given number is not armstrong");
        }

    }
}
