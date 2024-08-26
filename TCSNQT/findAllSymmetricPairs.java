package TCSNQT;

import java.util.HashMap;

public class findAllSymmetricPairs{
    public static void findSymmetric(int [][] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int firstElement = arr[i][0];
            int secondElement = arr[i][1];
            if(map.get(secondElement)!=null && map.get(secondElement)==firstElement){
                System.out.println(firstElement + " " + secondElement);
            }
            
                map.put(firstElement, secondElement);
        
        }
    }
    public static void FindSymmetricBruteForce(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j][0]==arr[i][1] && arr[i][0]==arr[j][1]){
                    System.out.println(arr[i][0] +" "+ arr[i][1]); 
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] arr ={{1,2},{2,1},{3,4},{4,5},{5,4}};
        findSymmetric(arr);
        FindSymmetricBruteForce(arr);
        
        
        
        
    }

}