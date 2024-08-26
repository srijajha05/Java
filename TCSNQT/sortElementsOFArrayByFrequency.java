package TCSNQT;
import java.util.*;

public class sortElementsOFArrayByFrequency {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,2,4,3,1,2};//Integer class used here
        List<Integer> list = Arrays.asList(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }
            else{
            map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        Collections.sort(list,(k1,k2)->{//list sorting as a function of of k1 and k2
            int frequency1 = map.get(k1);
            int frequency2 = map.get(k2);

            if(frequency1!=frequency2){
                return frequency2-frequency1;
            }

            return list.indexOf(k1) - list.indexOf(k2);
        });
        System.out.println(list);
       
    }
}

