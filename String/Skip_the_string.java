package String;

public class Skip_the_string {
    public static String skiplatter(String a) {
        if(a.isEmpty()) {
            return " ";
        }
        if(a.startsWith("apple")) {
            return (a.substring(5));
        } else {
            return a.charAt(0) + skiplatter(a.substring(1));
        }
    }
    public static void main(String[] args) {
    System.out.println(skiplatter("shubapplehow"));
    }
}
