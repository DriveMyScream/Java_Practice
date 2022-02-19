package methods;
import java.util.Scanner;

public class Sum_of_Two_Numbers {

    static int sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        int result = a + b;
        return result;
    }
    public static void main(String[] args) {

        int result = sumOfNumbers();
        int final_result = result + 20;
        System.out.println("The Updated result is: "+ final_result);














    }

}

