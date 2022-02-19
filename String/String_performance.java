package String;

public class String_performance {
    public static void main(String[] args) {
        String smallLatter = "";
        for(int i=0; i<26; i++) {
            char ch = (char) ('a' + i);
            smallLatter = smallLatter + " " + ch;
        }
        String capitalLatter = "";
        for(int i=0; i<26; i++) {
            char ch = (char) ('A' + i);
            capitalLatter = capitalLatter + " "+ ch;
        }
        System.out.println(smallLatter);
        System.out.println(capitalLatter);
    }
}
