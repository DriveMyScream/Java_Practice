package practice_problem;

public class Prime_Number_in_Range {
    public static boolean PrimeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Prime Numbers is: ");
        for(int i=1; i<=100; i++) {
            if(PrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
