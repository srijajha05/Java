package TCSNQT;

public class searchAnElementInArray {
    public static void search(int[] arr ,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
    public static void binarySearch(int[] arr, int x){
        int low=0;
        int high = arr.length-1;
        int mid=(low+high)/2;
        if(arr[mid]>x){
            high=mid-1;
        }
        else if (arr[mid]<x){
            low = mid+1;
        }
        if(arr[mid]==x){
            System.out.println("Found at index "+mid);
            return;
        }
    
        System.out.println("Element not found in the array");
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5};
        int x = 3;
        search(arr,x);
        binarySearch(arr,x);
    } 
}
