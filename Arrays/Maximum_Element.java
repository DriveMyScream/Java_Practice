package Arrays;

public class Maximum_Element {
    public static void main(String[] args) {
        int arr [] = {10, 30, 90, 50, 70, 40, 20, 60, 80, 100};
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in arrays is: " + max);
    }
}
