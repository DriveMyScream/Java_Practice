package Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int a [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Approach 1:
        System.out.println("Forward Print");
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("Reverse Print");
        for(int i=a.length-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }

        // Approach 2:
        System.out.println();
        System.out.println("Forward Print");
        for(int element: a) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Reverse Print");
        for(int i=0; i<(a.length / 2); i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        for(int element: a) {
            System.out.print(element + " ");
        }


    }
}
