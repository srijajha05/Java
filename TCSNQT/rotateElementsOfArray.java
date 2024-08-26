package TCSNQT;

public class rotateElementsOfArray {
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
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n = 2;
        printArray(arr);
        System.out.println();
        
        while(n!=0){
            int temp = arr[0];
            for(int i =0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;//first element shifted to last element
            n--;
        }
        printArray(arr);
        System.out.println();
        rotate(arr, n);
        printArray(arr);
        
    }
    
}
