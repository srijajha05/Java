package TCSNQT;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr ={3,5,7,9,1};
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] =temp;
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
