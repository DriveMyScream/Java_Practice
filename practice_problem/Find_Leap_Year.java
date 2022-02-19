package practice_problem;
import java.util.Scanner;

public class Find_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("the year " + year + " is a leap year");
        } else{
            System.out.println("the year " + year + " is a leap year");
        }
    }
}
