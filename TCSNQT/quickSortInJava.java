public class quickSortInJava {
    

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // Partition the array
                int pi = partition(arr, low, high);
                
                // Recursively sort elements before and after partition
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
    
        public static int partition(int[] arr, int low, int high) {
            // Pivot (Element to be placed at the correct position)
            int pivot = arr[high];
            
            // Index of smaller element
            int i = (low - 1);
    
            // Traverse through all elements
            for (int j = low; j < high; j++) {
                // If current element is smaller than the pivot
                if (arr[j] < pivot) {
                    i++;
                    
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            // Swap the pivot element with the element at i+1
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            // Return the index of the pivot element
            return i + 1;
        }
    
        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5};
            int n = arr.length;
            
            System.out.println("Unsorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            
            quickSort(arr, 0, n - 1);
            
            System.out.println("\nSorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
    
}
