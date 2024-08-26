package TCSNQT;

import java.util.*;

public class rankOfElementInArray {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6,101};
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], null);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i+1);//as we want rank to start from 1
        }
        System.out.println(map);
    }
}
