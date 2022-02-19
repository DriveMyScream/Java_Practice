package String;
import java.util.*;

public class SubsequenceAscii1 {
    public static ArrayList<String> subsequenceAscii(String a, String b) {
        if(b.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch = b.charAt(0);
        ArrayList<String> first = subsequenceAscii(a+ch, b.substring(1));
        ArrayList<String> second = subsequenceAscii(a, b.substring(1));
        ArrayList<String> third = subsequenceAscii(a+(ch+0), b.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = subsequenceAscii("", "abc");
        System.out.println(ans);
    }
}
