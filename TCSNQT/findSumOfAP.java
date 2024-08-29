package TCSNQT;

import java.util.*;

public class findSumOfAP {
    public static void findSumOfTheAP(int a , int d, int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum +a;//value added to sum
            a = a+d;//term moved to next term
        }
        System.out.println("The sum of the AP is "+sum);
    }
    public static void findSumUsingFormula(int a, int d, int n){
        int sum = (2*a +((n-1)*d))*n/2;
        System.out.println(sum);
    }
    public static int sumOfAP = 0;
    public static void sumofAPUsingRecursion(int a , int d, int n){
        
        if(n==0){
            System.out.println(sumOfAP);
            return;
        }
       
        sumOfAP = sumOfAP + a;
        

        sumofAPUsingRecursion(a+d, d, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term of AP");
        int a = sc.nextInt();
        System.out.println("Enter the common difference of AP");
        int d = sc.nextInt();
        System.out.println("Enter the number of terms in the AP");
        int n = sc.nextInt();
        findSumOfTheAP(a,d,n);
        findSumUsingFormula(a,d,n);
        sumofAPUsingRecursion(a, d, n);

    }
}