package TCSNQT;

public class rotateArrayByKElements {
    public static void printArray(int[]arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void reverse(int arr[],int start,int end){
        while(start>end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void rotate(int arr[],int k){
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, arr.length-1-k, arr.length);
        reverse(arr, 0, arr.length-k);

    }
    public static void rotateMyArray(int[] arr , int n){
        while(n!=0){
            int temp = arr[arr.length-1];
            for(int i =arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;//first element shifted to last element
            n--;
        }
    }
    public static void main(String[] args) {
        int [] arr ={3,7,8,9,10,11};
        int n = 3;
        printArray(arr);
        System.out.println();
        
        rotateMyArray(arr, n);
        printArray(arr);
        System.out.println();
        rotate(arr, n);
        printArray(arr);
    }
}
