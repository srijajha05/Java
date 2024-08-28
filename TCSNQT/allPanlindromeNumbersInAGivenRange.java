package TCSNQT;

import java.util.*;

public class allPanlindromeNumbersInAGivenRange {
    public static boolean checkPalindrome(int n){
        if(n<0||(n!=0 && n%10==0)){
            return false;
        }
        int half= 0;
        while(half<n){
            half = half*10+n%10;
            n=n/10;
        }
        if(half==n||half/10==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number");
        int start = sc.nextInt();
        System.out.println("Enter the ending number");
        int end = sc.nextInt();

        int count=0;

        for(int i=start;i<=end;i++){
            if(checkPalindrome(i)){
                System.out.print(i+" ");
                count++;
            }  
        }
        System.out.println();
        System.out.println("Total "+count +" palindromes in the given range");  
    }
}