package TCSNQT;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr ={3,5,7,9,1};
        for(int i=1;i<arr.length;i++){
            int j =i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] =temp;
                j--;
            }
        }
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
