package TCSNQT;

import java.util.*;

public class findSumToN {
    public static void findSum(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+sum);
    }
    public static void findSumUsingFormula(int n){
        System.out.println("The sum is "+(n*(n+1))/2);
    }

    public static void findSumUsingRecursion(int n , int sum){
        if(n<1){
            System.out.println("THe sum is "+sum);
            return;
        }
        findSumUsingRecursion(n-1, sum+n);
    }
    public static int otherRecursionMethodToFindSum(int n){
        if(n==0){
            return 0;
        }
        return n+ otherRecursionMethodToFindSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        findSum(n);
        findSumUsingFormula(n);
        findSumUsingRecursion(n,0);
        System.out.println("The sum is "+otherRecursionMethodToFindSum(n));
    }
}
