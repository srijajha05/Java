package TCSNQT;

import java.util.*;

public class sumOfNumbersInAGivenRange {
    public static void findSum(int a,int b){
        int sum =0;
        for(int i=a;i<=b;i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
    public static void findSumOptimal(int a, int b){
        int sum = (b*(b+1))/2 - ((a-1)*a)/2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the starting number");
       int a = sc.nextInt();

       System.out.println("Enter the terminating number");
       int b = sc.nextInt();

       findSum(a,b);
       findSumOptimal(a,b);


    }
}
