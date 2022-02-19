package practice_problem;

public class Sum_Of_Number_in_Method_Argument {
    public static void SumOfNumbers(int ... arr) {
        int sum = 0;
        for(int i=1; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The Sum of numbers is: "+ sum);
    }
    public static void main(String[] args) {
        SumOfNumbers(1, 2, 3);
        SumOfNumbers(10, 20, 30, 40, 50);
        SumOfNumbers(100, 200);
    }
}
