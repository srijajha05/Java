package TCSNQT;

import java.util.*;

public class findPermutation {
    public static int factorial(int n){
        int product =1;
        for(int i=1;i<=n;i++){
            product = product*i;
        }
        return product;
    }
    public static void nPr(int n, int r){
            System.out.println(factorial(n)/factorial(n-r));
    }

    public static void nprOptimal(int n, int r){
        int product =1;
        for(int i=n;i>=n-r+1;i--){
            product = product*i;
        }
        System.out.println(product);
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number of people in the classroom");
        int n = sc.nextInt();

        System.out.println("Enter the number of seats in the classroom");
        int r = sc.nextInt();

        nPr(n,r);
        nprOptimal(n,r);
        
    }
}
