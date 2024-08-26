package TCSNQT;


import java.util.*;

public class secondLargestAndSecondSmallest {
    public static void findSecondMinAndMax(int[]arr){//time complexity O(nlogn)
        if(arr.length<2){
            System.out.println("Invalid Input");
        }
        Arrays.sort(arr);
        System.out.println("Second smallest number is " + arr[1]+ " and second largest number is "+ arr[arr.length -2] );
    }
    public static void secondLargestAndSecondSmallestElement(int[]arr){
        if(arr.length<2){
            System.out.println("Invalid Input");
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
            else if (arr[i]<secondSmallest && arr[i]!= smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest Element is "+secondSmallest);

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element is "+secondLargest);
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
       
       secondLargestAndSecondSmallestElement(arr);
    }
    
}
