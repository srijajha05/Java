import java.util.*;
public class myFunctions{
    public static int returnSum(int a , int b) {
        int c = a + b;
        return c;   
    }
    public static void calculateFactorial(int a ) {
        if(a<0){
            return;
        }
        int n = 1;
         for(int i= 1 ; i<= a; i++){
           n = n*i;
        }
         System.out.println(n);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter 1st Number");
    //     int p = sc.nextInt();
    //     System.out.println("Enter 2nd Number");
    //     int q = sc.nextInt();
        
    //     System.out.println("The sum of the numbers are : " + returnSum(p, q));
    
    System.out.println("Enter The Number");
    int p = sc.nextInt();
    calculateFactorial(p );
     }
}