package String;
import java.util.*;

public class Substring_problem1 {
    public static ArrayList<String> subString(String a, String b) {
        if(b.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = b.charAt(0);
        ArrayList<String> left = subString(a+ch, b.substring(1));
        ArrayList<String> right = subString(a, b.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = subString("", "abc");
        System.out.println(ans);
    }
}
