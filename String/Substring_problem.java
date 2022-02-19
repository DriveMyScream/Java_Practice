package String;

public class Substring_problem {
    public static void subSequences(String a, String b) {
        if(b.isEmpty()) {
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        subSequences(a+ch, b.substring(1));
        subSequences(a, b.substring(1));
    }
    public static void main(String[] args) {
    subSequences("", "abc");

    }
}
