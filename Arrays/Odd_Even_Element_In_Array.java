package Arrays;

public class Odd_Even_Element_In_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenCount = evenCount + 1;
            } else{
                oddCount = oddCount + 1;
            }
        }
        System.out.println("The Count of Even:"+evenCount + ", " + "Odd:" + oddCount);
    }
}
