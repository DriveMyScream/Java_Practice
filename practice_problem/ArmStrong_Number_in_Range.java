package practice_problem;

public class ArmStrong_Number_in_Range {
    public static boolean ArmStrongNumber(int num){
        int temp = num;
        int digit = 0;
        int reverse = 0;
        int sum = 0;
        while(temp != 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        System.out.print("The ArmStrong Number is: ");
        for(int i=100; i<=1000; i++) {
            if(ArmStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
