import java.util.*;

public class PairsInArray {

    public static  void Pairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+"),");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs="+tp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Pairs(arr);

    }
}
