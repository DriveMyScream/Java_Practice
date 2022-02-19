package recursion;
import java.util.Scanner;
import java.util.*;


public class Palandrome_String {
    public static boolean palandrome(String str, int s, int e) {
        if(s == e) {
            return true;
        }
        if(s >= e/2) {
            return true;
        }
        if(str.charAt(s) != str.charAt(e-s-1)) {
            return false;
        }
        return palandrome(str, s+1, e);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        int start = 0;
        int end = str.length();
        boolean isPalandrome = palandrome(str, start, end);
        System.out.println(isPalandrome);

    }
}
