package practice_problem;
import java.util.Scanner;

public class Largest_Of_Three_Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = scan.nextInt();
        System.out.print("Enter a second number: ");
        int b = scan.nextInt();
        System.out.print("Enter a third number: ");
        int c = scan.nextInt();

        // Approach 1:
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println("The maximum number of the following is: "+ max);

        // Approach 2:
        int lar = a;
        if(a > b){
            lar = a;
        } else{
            lar = b;
        }
        if(c > lar){
            lar = c;
        }
        System.out.println("The Maximum Number Of The Following is: "+ lar);

        // Approach 3:
        if(a>b && a>c){
            System.out.println("The largest amoung three is: "+ a);
        } else if(b>c) {
            System.out.println("The largest amoung three is: "+ b);
        } else {
            System.out.println("The largest amoung three is: "+ c);
        }

        // Approach 4:
        int result = Math.max(c, Math.max(a, b));
        System.out.println("The largest amoung three is: "+ result);

    }
}
