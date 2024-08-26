package TCSNQT;

import java.util.*;

public class findingTheCountOfAnElement {
    public static void countTheOccurence(int[]arr,int size){
        boolean [] visited = new boolean[size];
        Arrays.fill(visited,false);

        for(int i=0;i<size;i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    visited[i]= true;
                    count++;
                }
            }
            System.out.println("The count of "+arr[i] +" is "+ count);
        }
    }
    public static void findCount(int arr[]){
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

    }
    public static void main(String[] args) {
        // System.out.println("Enter the size of the array");
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // for(int i =0;i<arr.length;i++){
        //     System.out.println("Enter the value of the "+i+" th index in the array");
        //     arr[i]= sc.nextInt();
        // }
        // countTheOccurence(arr,arr.length);

        int num [] = {1,3,2,5,1,3,1,5,1};
        findCount(num);
    }
}
