package practice_problem;

public class Prime_Number_between {
    public static void PrimeNumber(int start, int end) {
        for(int i=start; i<=end; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        PrimeNumber(10, 20);
    }
}
