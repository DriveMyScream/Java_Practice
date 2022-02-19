package String;

public class SubsequenceAscii {
    public static void subSequenceacci(String a, String b) {
        if(b.isEmpty()) {
            System.out.println(a);
            return;
        }
        char ch = b.charAt(0);
        subSequenceacci(a+ch, b.substring(1));
        subSequenceacci(a, b.substring(1));
        subSequenceacci(a+(ch+0), b.substring(1));
    }
    public static void main(String[] args) {
        subSequenceacci("", "ab");

    }
}
