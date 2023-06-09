import java.util.*;

public class LinerSearch {

    public static int linersearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the key");
       int key = scanner.nextInt();
        int index = linersearch(number, key);
        if(index==-1){
            System.out.println("Key not find in search");
        }
        else{
            System.out.println("Key found in search at index " + index);
        }
    }
}
