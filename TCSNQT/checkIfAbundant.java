package TCSNQT;

import java.util.*;

public class checkIfAbundant {
    public static void checkIfAbundantOrNot(int n){
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum +i;
            }
        }
        if(sum>n){
            System.out.println("It is an abundant number");
        }
        else{
            System.out.println("It is not an abundant number");
        }
    }

    public static void checkIfAbundantOrNotOptimal(int n){
        int sum =0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0 & n/i==i){
                sum = sum +i;
            }
            else if(n%i==0){
                sum = sum + i+ n/i;
            }
        }
        if(sum>n){
            System.out.println("It is an abundant number");
        }
        else{
            System.out.println("It is not an abundant number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        checkIfAbundantOrNot(n);
        checkIfAbundantOrNotOptimal(n);
    }
}