package methods;

public class Block_Scope {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        {
            num1 = 100;
            int num3 = 30;
            System.out.println(num1);
            System.out.println(num2);
        }
        System.out.println(num1);
        // System.out.println(num3);
    }
}
