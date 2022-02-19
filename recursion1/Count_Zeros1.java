package recursion1;
import java.util.Scanner;

public class Count_Zeros1 {
    public static int countZeros(int num, int count) {
        if(num  == 0) {
            return count;
        }
        if(num%10 == 0) {
            return countZeros(num/10, count+1);
        } else{
            return countZeros(num/10, count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        int result = countZeros(num, count);
        System.out.println(result);
    }
}
