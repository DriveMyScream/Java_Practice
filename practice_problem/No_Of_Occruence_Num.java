package practice_problem;
import java.util.Scanner;

public class No_Of_Occruence_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        System.out.print("Enter a occurence: ");
        int num1 = scan.nextInt();
        int count = 0;
        int temp = num;
        int num2 = 0;
        while(temp != 0){
            num2 = temp % 10;
            if(num1 == num2){
                count = count + 1;
            }
            temp = temp / 10;
        }
        System.out.println("The Count of " + num1 + " in " + num + " is " + count);
    }
}
