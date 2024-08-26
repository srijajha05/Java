package TCSNQT;

import java.util.*;

public class findingDuplicatesInArray {
    public static void findRepeating(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void findDuplicatesUsingHashMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2,2,2,2,2,2,4};
        findDuplicatesUsingHashMap(arr);
        System.out.println();
        findRepeating(arr);
    }
}
