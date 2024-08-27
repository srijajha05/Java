package TCSNQT;

public class searchAnElementInArray {
    public static void search(int[] arr ,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int x = 3;
        search(arr,x);
    } 
}
