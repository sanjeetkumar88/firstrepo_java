import java.util.*;

public class BinarySearch {

    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start +end)/2;
            //comparision

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Enter the key");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        int index = binarySearch(arr,key);
        if(index==-1){
            System.out.println("Key not find in search");
        }
        else{
            System.out.println("Key found in search at index " + index);
        }
    }
}
