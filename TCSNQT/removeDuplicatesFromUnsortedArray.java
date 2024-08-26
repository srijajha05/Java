package TCSNQT;

import java.util.*;

public class removeDuplicatesFromUnsortedArray {
   public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,2,3,4,44,22,333,44,88,91,41};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            System.out.print(arr[i]+" ");
            map.put(arr[i], 1);
        }
    }
    

    
   } 
}
