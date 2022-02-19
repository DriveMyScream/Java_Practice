package practice_problem;
import java.util.Scanner;

public class FtoC_temperatureconverter {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Temperature in celsius: ");
        float TempC = scan.nextFloat();
        float TempF = (TempC * 9/5) + 32;
        System.out.println("The Temperature in fahrenheit: "+ TempF);
    }
}
