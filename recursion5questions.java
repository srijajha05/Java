import java.util.*;
public class recursion5questions {

/*
    //print all permutations of a string
    public static void printPermutation(String str, String permutation) {

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i)+str.substring(i+1);  //this removes ith string from str and makes new String
            printPermutation(newString, permutation+currentChar);
        }
        
    }
*/
/*
//counts the paths to move from top left corner to bottom right corner
public static int countPaths(int i, int j, int m, int n){
    if(i==m || j==n){
        return 0;
    }
    if(i==m-1 && j==n-1){
        return 1;
    }

    //move rightwards
    int rightpaths = countPaths(i, j+1, m, n);

    //move downwards
    int downpaths = countPaths(i+1, j, m, n);

    return rightpaths+downpaths;
}
*/
/*
    //how many ways tiles can be placed 1*m tile on n*m space
    public static int placeTiles(int m , int n){
        if(m==n){
            return 2;
        }
        if(m<n){
            return 1;
        }
        //place vertically
        int vertical = placeTiles(m-n,n);
        //place horizontally
        int horizontal = placeTiles(m-1, n);
        return vertical+horizontal;
    }
*/
/*
    //calculating ways in which guests can be called
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }
        
        //call single
        int single = callGuests(n-1);
        //call in pair
        int pair = (n-1)*callGuests(n-2);

        return single+pair;
    }
*/
/*
    //finding subsets for first n natural numbers

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+ " "); 
        }
        System.out.println();
        
    }
    public static void findSubset(int n , ArrayList<Integer> subset) {
        if(n==0){
            printSubset(subset);
            return;
        }

        //adding the element to subset
        subset.add(n);
        findSubset(n-1, subset);

        //clearing the susbet again
        subset.remove(subset.size()-1);

        //not adding any element
        findSubset(n-1, subset);
    }
*/
    public static void main(String[] args) {
        //printPermutation("abc", "");
        
        // System.out.println("Enter the rows of matrix");
        // Scanner sc = new Scanner (System.in);
        // int m = sc.nextInt();
        // System.out.println("Enter the columns of the matrix");
        // int n = sc.nextInt();
        // int totalways =countPaths(0, 0,m,n);
        // System.out.println(totalways);

        // int a = placeTiles(4,2);
        // System.out.println(a);

        // int p = callGuests(4);
        // System.out.println(p);

        // System.out.println("Enter the value of n:");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // ArrayList<Integer> subset = new ArrayList<>() ;

        // findSubset(n,subset);
    }
}
