import java.util.* ;
public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i =0 ; i< size ; i++){
            System.out.println("Enter the " + i + "th element");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array you have input:");
        for(int i =0 ; i< size ; i++){
        System.out.print( arr[i] + " ");
        }
/*
        //Bubble Sort
        for(int i=0 ; i<size-1; i++){
            for(int j = 0; j<size-i-1 ; j++){
                if(arr[j]> arr[j+1]){

                //swap
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
           
                }
            }
        }
        System.out.println();
        System.out.println("The sorted array is:");
        for(int i =0 ; i< size ; i++){
        System.out.print( arr[i] + " ");
        }
*/
        
        //Selection Sort
        for(int i=0; i < arr.length - 1 ; i++){
            int smallest = i;
            for(int j=i+1; i < arr.length ;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j ;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
                
            
        }

        System.out.println();
        System.out.println("The sorted array is :");
        for(int i =0 ; i< size ; i++){
        System.out.print( arr[i] + " ");
        }


    }
}
