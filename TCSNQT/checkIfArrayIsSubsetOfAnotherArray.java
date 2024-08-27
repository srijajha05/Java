package TCSNQT;

import java.util.*;


public class checkIfArrayIsSubsetOfAnotherArray {
    public static void check(int[] array ,int[] subArray){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put( i,array[i]);
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<subArray.length;i++){
            map2.put(i,subArray[i]);
        }
        System.out.println(map);
        System.out.println(map2);
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==array[i]){

            }
        }

    }
        
    


    
    public static void main(String[] args) {
        int [] arr ={2,3,1,5,4};
        int [] subArr ={2,3};
        check(arr,subArr);
    }
}
