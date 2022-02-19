package practice_problem;
import java.util.Scanner;

public class Char_is_upper_lower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        char c = scan.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("This is a small letter");
        } else{
            System.out.println("This is an capital latter");
        }
    }
}
