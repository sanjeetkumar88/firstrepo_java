import java.util.*;

public class LargestNumber {

    public static int maximum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(maximum(arr));
    }
}
