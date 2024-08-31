package TCSNQT;

import java.util.*;

public class fibonacciSeries {

    public static void printFibonacci(int n){
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm+" "+secondTerm+" ");
        for(int i=0;i<n-2;i++){
            int thirdTerm = firstTerm+secondTerm;
            System.out.print(thirdTerm+" ");
            firstTerm =secondTerm;
            secondTerm=thirdTerm;
        }
    }
    public static int printFibonacciUsingRecursion(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return printFibonacciUsingRecursion(n-1)+printFibonacciUsingRecursion(n-2);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number");
        int n = sc.nextInt();
        printFibonacci(n);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(printFibonacciUsingRecursion(i)+" ");
        }
    }
}