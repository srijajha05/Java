package TCSNQT;

import java.util.*;

public class factorsOfANumber {
    public static void printFactorsOptimized(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0 && n/i==i){
                System.out.print(" "+i+" ");
            }
            else if(n%i==0){
                System.out.print(" "+i+" "+n/i+" ");
            }
        }
    }
    public static void printFactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int n = sc.nextInt();

        printFactors(n);
        System.out.println();
        printFactorsOptimized(n);
        
    }
}