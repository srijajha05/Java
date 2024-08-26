import java.util.*;
public class nQueen {

    public static boolean isSafe(int row , int col, char[][] board){
        //checking horizontal line ---> checking all columns
        for(int j=0; j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }  
        }
 
        //checking vertical line ---> checking all rows
        for(int i=0; i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }  
        }

        //checkking upper-left   ---> (r-1 , c-1)
        int r = row;//without this code will not run
        for(int c =0;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            } 
        }

        //Checking upper right  ---> (r-1,c+1)
        r = row;//without this code will not run
        for(int c =0;c<board.length && r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            } 
        }

        //Checking lower left ---> (r+1,c-1)
        r = row;//without this code will not run
        for(int c =0;c>=0 && r<board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            } 
        }

        //Checking lower right ---> (r+1,c+1)
        r = row; //without this code will not run
        for(int c =0;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            } 
        }

        return true;
    }

    public static void saveBoard(List<List<String>> allboards,char[][] board){
        String row ="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row += "Q";
                }
                else{
                    row += ".";
                }

            }
            newBoard.add(row);
        }
        allboards.add(newBoard);
    }
    public static void helpToSolveNQueen(char[][] board, List<List<String>> allboards,int col){

        if(col==board.length){
            saveBoard(allboards,board);
            return;
        }
        for(int row =0; row<board.length;row++){

            if(isSafe(row,col,board)){
                board [row][col] = 'Q' ;
                helpToSolveNQueen(board, allboards, col+1);
                //in case it is not the right place
                board [row][col] = '.';
            }

        }

    }
    public static List<List<String>> nQueens(int n){

        //aray list containing all boards
        List<List<String>> allboards = new ArrayList<>();

        //declaring a 2D character array
        char[][] board = new char[n][n];

        helpToSolveNQueen(board, allboards, 0);

        return allboards;
    }
    public static void main(String[] args) {
        System.out.println(nQueens(4));
        
    }
}
