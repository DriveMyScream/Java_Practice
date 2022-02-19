package Switch_Statement;
import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Employee Id: ");
        int Id = scan.nextInt();
        switch(Id){
            case 1:
                System.out.println("Shubham");
                break;
            case 2:
                System.out.println("John");
                break;
            case 3:
                System.out.println("Ramesh");
                System.out.print("Enter a department of employee: ");
                String dept = scan.next();
                switch (dept){
                    case "IT":
                        System.out.println("This is an It Department");
                        break;
                    case "Management":
                        System.out.println("This is an management Department");
                        break;
                    default:
                        System.out.println("Enter a valid Department");
                }
                break;
            case 4:
                System.out.println("Rahul");
                break;
            default:
                System.out.println("Enter a valid employee id");
        }
    }
}
