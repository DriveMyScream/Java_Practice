package conditionals_and_loops;
import java.util.Scanner;

public class If_and_else {
    public static void main(String [] main){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = scan.nextInt();
        if(salary < 10000){
            salary = salary + 2000;
        } else{
            salary = salary + 1000;
        }
        System.out.println("Your salary is with increament of bonous is:"+salary);






    }
}
