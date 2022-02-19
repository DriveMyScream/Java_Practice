package String;

public class Skip_the_String1 {
    public static String skipTheString(String a) {
        if(a.isEmpty()) {
            return " ";
        }
        if(a.startsWith("app") && !a.startsWith("apple")) {
            return skipTheString(a.substring(3));
        } else {
            return a.charAt(0) + skipTheString(a.substring(1));
        }
    }
    public static void main(String[] args) {
       System.out.println(skipTheString("shubapplehowm"));
        System.out.println(skipTheString("shubapphowm"));

    }
}
