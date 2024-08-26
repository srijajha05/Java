package TCSNQT;
import java.util.*;



public class rearrangeArrayAcsendingDescending {
    public static void rearrange(int[]arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=arr.length-1;i>=arr.length/2;i--){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={8,7,1,6,5,9};
        rearrange(arr);
    
        
    }
    
}
