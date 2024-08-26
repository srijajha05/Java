package TCSNQT;

public class insertAtStartEndAndGivenIndex {
    public static void printArray(int [] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void insertAtBeginning(int [] arr , int value){
        int lastElementIndex = arr.length-1;
        int secondLastElementIndex = lastElementIndex-1;
        for (int i =secondLastElementIndex; i >=0; i--) {
            arr[i+1] =arr[i];//shift all elements to right
        }
        arr[0] = value;
    }
    public static void insertAtEnd(int [] arr, int value){
        arr[arr.length-1] = value;//just replaces the last value in the array
    }
    public static void insertAtIndex(int[] arr, int value,int index){
        for(int i=arr.length-2;i>=index;i--){
            arr[i+1] = arr[i];//shift all elements like insertATBeginning till required index

        }
        arr[index]= value;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        printArray(arr);
        insertAtBeginning(arr,5);
        printArray(arr);
        insertAtEnd(arr,100);
        printArray(arr);
        insertAtIndex(arr,10,2);
        printArray(arr);

    }
}
