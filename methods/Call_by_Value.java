package methods;

public class Call_by_Value {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("The value of a is: "+a);
        System.out.println("The value of b is: "+b);
    }
}
