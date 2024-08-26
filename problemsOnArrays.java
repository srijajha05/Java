import java.util.* ;
public class problemsOnArrays {
    public static void main(String[] args) {

/*     
        //input names and display it using an array

        //input size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        String arr[] = new String [size];

        //input array elements
        for(int i=0; i<size ; i++){
            System.out.println("Enter the value of "+ i +"th element in the array");
            String val = sc.next();
            arr[i] = val;
        }
        //displaying the elements on screen
        System.out.println("Your array is :");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
*/
/* 
        //finding maximum and minimum number in an array

         //input size of array
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array ");
         int size = sc.nextInt();
         int arr[] = new int [size];
 
         //input array elements
         for(int i=0; i<size ; i++){
             System.out.println("Enter the value of "+ i +"th element in the array");
             int val = sc.nextInt();
             arr[i] = val;
         }

         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;

         //finding max and min value
         for(int i=0; i<size ; i++){
            if(arr[i]> max){
                max = arr[i];

            }
            if(arr[i]<min){
                min = arr[i];
            }
         }
         System.out.println("The minimum value is " + min + " and the maximum value is " + max);
*/
/*
        //checking ascending and descending order
        //input size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int [size];

        //input array elements
        for(int i=0; i<size ; i++){
            System.out.println("Enter the value of "+ i +"th element in the array");
            int val = sc.nextInt();
            arr[i] = val;
        }
        
        boolean isAscending = true;

        //Note that the loop runs from 0 to i < (size-1) otherwise you will get array out of bound exception as i+1 is also used here
        for(int i=0; i<size - 1 ; i++){
            if (arr[i] > arr[i+1]){
                isAscending = false;
            }
        }
        
        if(isAscending == true){
            System.out.println("Array is in ascending order");
            
        }
        else{
            System.out.println("Array is not in ascending order");
        }
*/
    }
    
}
