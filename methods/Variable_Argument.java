package methods;

public class Variable_Argument {
    public static int SumOfNumbers(int ...args) {
        int sum = 0;
        for(int element: args){
            sum = sum + element;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = SumOfNumbers(1, 2, 3, 4, 5, 6);
        System.out.println(a);

        int b = SumOfNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(b);
    }
}
