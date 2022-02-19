package patterns;

public class Pattern7 {
    public static void main(String[] args) {
        for(int row=1; row<=6; row++){
            for(int col=2; col<=row; col++) {
                System.out.print("  ");
            }
            for(int col=6; col>=row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
