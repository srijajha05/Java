package TCSNQT;
import java.util.*;
public class removeDuplicatesFromArray {
    public static void printArray(int[]arr){
        for(int x :arr){
            System.out.print(x+" ");
        }
    }
    public static void BruteForce(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
       
        
     
        int i=0;
        for(int val :set){
            arr[i++] = val; 
        }
        
    }

    public static int optimal(int[]arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }

    
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,5};
        printArray(arr);
        System.out.println();
        BruteForce(arr);
        printArray(arr);
        System.out.println();
        System.out.println("The unique elements are "+optimal(arr));
        printArray(arr);
        
    }
}

