package practice_problem;
import java.util.Scanner;

public class Least_Common_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        int hcf = 0;
        for(int i=1; i<=num1 || i<=num2; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("The Least common multiple is: "+ lcm);
    }
}
