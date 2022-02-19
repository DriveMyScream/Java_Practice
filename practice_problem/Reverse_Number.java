package practice_problem;
import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int temp = num;
        int reverse = 0;
        int digit = 0;
        while(temp != 0){
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("The reverse of number " + num + " is " + reverse);

    }
}
