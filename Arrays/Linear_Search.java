package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int num = 90;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num){
                System.out.println("The Given number " + num + " is present at index of: "+ i);
            }
        }
    }
}
