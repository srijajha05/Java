import java.util.* ;
public class problemOn2DArrays {
    public static void main(String[] args) {
        
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

/* 
        //Spiral traversal
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = rows - 1 ;
        int colEnd = columns - 1 ;

        System.out.println("The Spiral Array is :");

        while(rowStart <= rowEnd && colStart <= colEnd){

            for(int i=colStart ; i <= colEnd; i++){
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++ ;

            for(int i=rowStart ; i <= rowEnd; i++){
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;

            for(int i=colEnd ; i >= colStart; i--){
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd-- ;

            for(int i=rowEnd ; i >= rowStart; i--){
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++ ;

            
        }
*/

/*
        //Original Matrix
        System.out.println("The original matrix is :");
        for(int i = 0 ; i< rows ; i++){
            for(int j =0 ; j< columns; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //Transpose of the matrix
        System.out.println("The transpose of the matrix is : ");
        for(int i = 0 ; i< columns ; i++){
            for(int j =0 ; j< rows; j++ ){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
*/

    }
    
}
