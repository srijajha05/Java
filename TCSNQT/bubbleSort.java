package TCSNQT;

public class bubbleSort{
    public static void main(String[] args) {
        int [] arr ={3,5,7,1,99,87};
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}