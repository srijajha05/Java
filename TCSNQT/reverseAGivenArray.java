package TCSNQT;

import java.util.*;

public class reverseAGivenArray {
    public static void reversetheArray(int[]arr){
        int [] reversedArray = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            reversedArray[i] = arr[arr.length -i-1];
        }
        for(int i : reversedArray){
            System.out.print(i+" ");
        }
    }
    public static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void reverseMyArray(int arr[],int startIndex,int endIndex){
        while(startIndex<endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        printArray(arr);
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
       reversetheArray(arr);
       System.out.println();
       reverseMyArray(arr, 0, arr.length-1);
    }
}
