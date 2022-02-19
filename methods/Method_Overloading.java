package methods;

public class Method_Overloading {
    public static void Sum(int a, int b) {
        int result = a + b;
        System.out.println("The Sum of two numbers is: "+ result);
    }
    public static void Sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("The Sum of two numbers is: "+ result);
    }
    public static void Sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("The Sum of two numbers is: "+ result);
    }
    public static void main(String[] args) {
        Sum(10, 20);
        Sum(10, 20, 30);
        Sum(10, 20, 30, 40);
    }
}
