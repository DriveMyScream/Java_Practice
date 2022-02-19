package String;

public class Skip_character1 {
    public static String skipCharacter(String a) {
        if(a.isEmpty()) {
            return " ";
        }
        char ch = a.charAt(0);
        if(ch == 'a') {
           return skipCharacter(a.substring(1));
        } else {
            return ch + skipCharacter(a.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipCharacter("bcaabandbaa"));
    }
}
