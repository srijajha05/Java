package TCSNQT;


import java.util.*;

public class findingLargestNumberInArray {
    public static int findMaximim(int[]arr){//time complexity O(nlogn)
        Arrays.sort(arr);
        return arr[arr.length -1];
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.println("Enter the value of the "+i+" th index in the array");
            arr[i]= sc.nextInt();
        }
       
       System.out.println("The maximum element is "+findMaximim(arr));
    }
    
}
