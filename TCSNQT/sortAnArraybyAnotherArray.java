package TCSNQT;

import java.util.*;

public class sortAnArraybyAnotherArray {
    public static void sortArrayByArray2(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1 );
            }
            else{
                map.put(arr1[i], 1);
            }
        }
        System.out.println(map);
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                for(int j=0;j<map.get(arr2[i]);j++){
                    arr1[count] = arr2[i];
                    count++;
                }
            }
            map.remove(arr2[i]);
        }
        int [] remainingArray = new int [arr1.length-count];
        int count2 =0;

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            for(int j=0;j<e.getValue();j++){
                remainingArray[count2] = e.getKey();
                count2++;
            }
        }
        Arrays.sort(remainingArray);
        for(int val:remainingArray){
            arr1[count] = val;
            count++;
        }
        for(int value: arr1){
            System.out.print(value+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr1 ={2,1,2,5,7,1,9,3,6,8,8};
        int [] arr2 ={2,1,8,3};
        sortArrayByArray2(arr1,arr2);
    }
}
