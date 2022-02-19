package String;

public class Skip_character_Recursion {
    public static String skipRows(String a, String b, int index){
        if(index == a.length()) {
            return b;
        }
        if(a.charAt(index) != 'a') {
            b = b + a.charAt(index);
        }
        return skipRows(a, b, index+1);
    }
    public static void main(String[] args) {
        String a = "baccad";
        String b = "";
        int index = 0;
        String result = skipRows(a, b, index);
        System.out.println(result);
    }
}
