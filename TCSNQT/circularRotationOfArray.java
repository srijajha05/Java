package TCSNQT;

public class circularRotationOfArray {
    public static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void clockwiseCircularRotation(int[] arr, int n){
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, n);
        reverseArray(arr, n+1, arr.length-1);

    }
    public static void anticlockwiseCircularRotation(int[] arr, int n){
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, n-1);
        reverseArray(arr, n, arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = 2;
        clockwiseCircularRotation(arr,n);
        printArray(arr);
        anticlockwiseCircularRotation(arr,n);
        printArray(arr);
    }
}