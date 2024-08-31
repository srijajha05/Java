package TCSNQT;

import java.util.*;

public class sumOfGPSeries{
    public static double sum = 0;
    public static void findSumOfGP(double a, double r,int n){
        if(n==0){
            System.out.println("The sum is "+sum);
            return;
        }
       
        sum = sum + a;
        findSumOfGP(a*r, r, n-1);
        
    }

    public static void findSumUsingFormula(double a, double r , int n){
        double value = (a*((Math.pow(r,n))-1))/(r-1);
        System.out.println("The sum of GP is "+value);
    }
    public static void findSumUsingIteration(double a , double r, int n){
        double value = 0.0;
        for(int i =1 ;i<=n;i++){
            value = value+a;
            a=a*r;
            
        }
        System.out.println("The sum is "+value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term of the GP ");
        double a = sc.nextDouble();

        System.out.println("Enter the common ratio of the GP ");
        double r = sc.nextDouble();

        System.out.println("Enter the number of terms in the GP ");
        int n = sc.nextInt();

        findSumOfGP(a,r,n);
        findSumUsingFormula(a,r,n);
        findSumUsingIteration(a,r,n);
    }
}