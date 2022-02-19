package String;

public class Skip_character {
    public static void main(String[] args) {
        String a = "baccad";
        String b = "";
        for(int i=0; i<=a.length()-1; i++) {
            if(a.charAt(i) != 'a') {
                b = b + a.charAt(i);
            }
        }
        System.out.println(b);
    }
}
