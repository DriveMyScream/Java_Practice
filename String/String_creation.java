package String;

public class String_creation {
    public static void main(String[] args) {
        String a = "Shubham";
        String b = "Shubham";
        // this two reference variable is created in string pool area so they are pointing to the same object.
        System.out.println(a == b);

        String name = new String("Shubham");
        String name2 = new String("Shubham");
        // equality cheack will cheack only the values not a reference variable is pointing to the same object or not.
        System.out.println(name.equals(name2));

        // if the value is same and both the reference variable is pointing to the same object then it will return true.
        System.out.println(name == name2);
    }
}
