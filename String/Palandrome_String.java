package String;
import java.util.*;

public class Palandrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.next();
        String name1 = "";
        for(int i=name.length()-1; i>=0; i--) {
            name1 = name1 + name.charAt(i);
        }
        if(name.equals(name1)) {
            System.out.println("The String is palandrome");
        } else {
            System.out.println("The String is not palandrome");
        }
    }
}
