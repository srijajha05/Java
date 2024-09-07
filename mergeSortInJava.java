public class mergeSortInJava{
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        

        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
    
    public static void quickSortArray(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr,low, high);

            quickSortArray(arr, low, pi-1);
            quickSortArray(arr, pi+1, high);
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1 , 5, 7, 2, 9};

        quickSortArray(arr,0,(arr.length)-1);
        
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        
    }
}