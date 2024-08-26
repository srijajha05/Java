import java.util.*;
public class mergeSort{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void mergeArray(int[] arr, int startingIndex, int mid, int endingIndex){
        int merged[] =new int[endingIndex-startingIndex+1];
        int index1 = startingIndex;
        int index2 = mid +1;
        int x = 0;

        while(index1<=mid && index2<=endingIndex){
            if(arr[index1]<arr[index2]){
                merged[x] = arr[index1];
                x++;index1++;
            }
            else{
                merged[x] = arr[index2];
                x++;index2++;
            }
        }

        while(index1<=mid){
            merged[x]=arr[index1];
            x++;index1++;
        }

        while(index2<=endingIndex){
            merged[x]=arr[index2];
            x++;index2++;
        }

        for(int i=0 , j=startingIndex;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }

    }
    public static void mergeSortArray(int[] arr, int startingIndex, int endingIndex){
        if(startingIndex>=endingIndex){
            return;
        }
        
        int mid = startingIndex + (endingIndex-startingIndex)/2;

        mergeSortArray(arr,startingIndex,mid);
        mergeSortArray(arr,mid+1,endingIndex);

        mergeArray(arr,startingIndex,mid,endingIndex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the value of "+i+"th index of the array");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array:");
        printArray(arr);

        System.out.println("Sorted Array:");
        mergeSortArray(arr, 0, size-1);
        printArray(arr);
        
    }
}