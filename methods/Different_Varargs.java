package methods;
import java.util.Arrays;

public class Different_Varargs {
    public static void Collection(int a, int b, int ... arr) {
        int result = a + b;
        System.out.println("The Sum of two numbers is: "+ result);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Collection(10, 20, 1, 2, 3, 4, 5);
    }
}
