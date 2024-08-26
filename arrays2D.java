import java.util.*;
public class arrays2D {
    public static void main(String[] args) {

        //Input a 2D array and search elements in it


        //input size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the array ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of the array ");
        int columns = sc.nextInt();
        int arr[][] = new int [rows][columns];

        //input array elements
        for(int i=0; i<rows ; i++){
            for(int j=0; j<columns; j++){
            System.out.println("Enter the value of "+ i +"th rows and " + j +"th column  in the array");
            int val = sc.nextInt();
            arr[i][j] = val;
            }
        }
        //search for the element
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        //output to display the array 
        for(int i=0 ; i<rows ;i++){
            for(int j=0 ; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //output the index of element if array is present
        for(int i =0 ; i<rows; i++ ){
            for(int j= 0; j<columns;j++){
            if(arr[i][j]== x){
                System.out.println("Element found in " + i +"th row of " + j + "th column" );
            }
            }
        }

    }
    
}
