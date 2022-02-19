package practice_problem;
import java.util.Scanner;

public class Factors_of_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println();
            System.out.print("Factors of " + i + " is: ");
            for(int j=1; j<=num; j++){
                if(i % j == 0){
                    System.out.print(j + " ");
                }
            }
        }
    }
}
