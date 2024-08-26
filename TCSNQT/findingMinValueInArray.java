package TCSNQT;

import java.util.*;

public class findingMinValueInArray{
    public static int findMinimum(int[] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
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
       
       System.out.println("The minimum element is "+findMinimum(arr));


    }
}
