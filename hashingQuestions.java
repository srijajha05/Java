import java.util.*;

public class hashingQuestions {
    /* 
    public static void findingOccurence(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        int n = arr.length;
        for(int keys:map.keySet()){
            if(map.get(keys)>n/3){
                System.out.println(keys);
            }
        }

    }
    */
    /*
    public static void union(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
        System.out.println("Size of union set is "+set.size());
    }
    */
    /*
    public static void intersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count ++;
                System.out.println(arr2[i]);
                set.remove(arr2[i]);//mandatory step else count will increase due to duplicate elements in set2
            }
        }
        System.out.println("Number of elements in interesction set are : "+count);
    }
    */
    /*
    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> reverseMap = new HashMap<>();
        for(String key : ticket.keySet()){
            //key -> key   value ->ticket.get(key)  in original ticket HashMap
            //exchanged in reverse map
            reverseMap.put(ticket.get(key), key);
        }
        for(String key : ticket.keySet()){
            if(!reverseMap.containsKey(key)){//key is unique not present in both maps
                return key;
            }
        }
        return null;
    }
    */

    public static void main(String[] args) {
        // int nums [] = {1,3,2,5,1,3,1,5,1};
        // findingOccurence(nums);

        // int arr2[] = {7,3,9};
        // int arr1[] = {6,3,9,2,9,4};
        // union(arr1,arr2);
        // intersection(arr1, arr2);
        
        // HashMap<String,String> ticketMap = new HashMap<>();
        // ticketMap.put("Chennai", "Bengaluru");
        // ticketMap.put("Mumbai","Delhi");
        // ticketMap.put("Goa","Chennai");
        // ticketMap.put("Delhi", "Goa");

        // String start = getStart(ticketMap);
        // while(ticketMap.containsKey(start)){
        //     System.out.print(start +"->");
        //     start = ticketMap.get(start);//updates start point
        // }
        // System.out.print(start);//as last destination was skipped in while loop

        int arr[] = {10,2,-2,-20,10};
        int k = -10;//sum of subarray value
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);//for empty subarray
        int sum =0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(map.containsKey(sum-k)){
                ans = ans + map.get(sum-k);//frequency of occurence of sum
            }
            if(map.containsKey(sum)){//value already exists
                map.put(sum, map.get(sum)+1);
            }
            else{//new value added
                map.put(sum,1);
            }
            
        }

        System.out.println(ans);



    }
}

