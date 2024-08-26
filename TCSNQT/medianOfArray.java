package TCSNQT;
import java.util.*;

public class medianOfArray {
    public static void findMedian(int[]arr){
        Arrays.sort(arr);
        if(arr.length%2 ==0){
            System.out.println((double)(arr[arr.length/2]+arr[arr.length/2 - 1])/2);

        }
        else{
            System.out.println(arr[arr.length/2 ]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,5,1,7};
        findMedian(arr);
    }
}
