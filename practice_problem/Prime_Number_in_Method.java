package practice_problem;
import java.util.Scanner;

public class Prime_Number_in_Method {
    public static void primeNumber(int num) {
        boolean isPrime = true;
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime == true) {
            System.out.println("The Given number is prime number");
        } else{
            System.out.println("The Given number is not prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        primeNumber(num);

    }
}
