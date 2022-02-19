package practice_problem;
import java.util.Scanner;

public class Count_of_EvenOdd_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int EvenCount = 0;
        int OddCount = 0;
        int digit = 0;
        while(temp != 0){
            digit = temp % 10;
            if(digit % 2 == 0) {
                EvenCount = EvenCount + 1;
            } else{
                OddCount = OddCount + 1;
            }
            temp = temp / 10;
        }
        System.out.println("Even Count: "+ EvenCount + ", Odd Count: " + OddCount);
    }
}
