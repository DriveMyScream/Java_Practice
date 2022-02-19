package Switch_Statement;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Fruit:");
        String fruit = scan.next();
        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Grapes":
                System.out.println("small fruits");
                break;
            case "strawberry":
                System.out.println("Expensive fruit");
                break;
            case "Apple":
                System.out.println("A red fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

    }
}
