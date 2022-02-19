package conditionals_and_loops;
import java.util.Scanner;

public class if_elseif_else {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = scan.nextInt();
        if(salary>1000 && salary<10000){
            salary = salary + 1000;
        } else if(salary>2000 && salary<20000){
            salary = salary + 2000;
        } else {
            salary = salary + 3000;
        }
        System.out.println("Your salary with bonus increament is: "+salary);


    }
}
