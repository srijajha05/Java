package TCSNQT;
import java.util.*;

public class checkIfArrayIsSubsetOfAnotherArray {
    public static boolean check(int[] array ,int[] subArray){
        if(subArray.length>array.length){
            return false;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<subArray.length;j++){
                if(subArray[j]==array[i]){
                    return true;
                }
            } 
        }
        return false;
    }

    public static boolean BinarySearch(int [] arr, int x){
        int low=0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if (arr[mid]<x){
                low = mid+1;
            }
            else if(arr[mid]==x){
                return true;
            }
    }
        return false;

    }

    public static boolean isASubset(int[] arr, int[] subArr){
        if(subArr.length>arr.length){
            return false;
        }
        
        Arrays.sort(arr);
        for(int i=0;i<subArr.length;i++){
            boolean present = BinarySearch(arr,subArr[i]);
            if(present==false){
                return false;
            }
        }
        return true;
    }
    public static boolean checkUsingHashMap(int[] arr, int[] subArr){
        if(subArr.length>arr.length){
            return false;
        }
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], true);
        }
        for(int j=0;j<subArr.length;j++){
            if(map.containsKey(arr[j])==false){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int [] arr ={2,3,1,5,4};
        int [] subArr ={2,3,1};
        System.out.println(check(arr,subArr));
        System.out.println(isASubset(arr, subArr));
        System.out.println(checkUsingHashMap(arr,subArr));
    }
}
