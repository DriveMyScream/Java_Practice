package practice_problem;
import java.util.Scanner;

public class Palandrome_Number_in_Method {
    public static void PalandromeNumber(int num){
        int temp = num;
        int reverse = 0;
        int digit = 0;
        while(temp != 0) {
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        if(num == reverse) {
            System.out.print("Given number is palandrome");
        } else{
            System.out.println("Given number is not palandrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PalandromeNumber(num);
    }
}
