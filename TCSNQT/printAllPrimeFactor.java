package TCSNQT;

import java.util.*;

public class printAllPrimeFactor{
    public static void printPrime(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){  
                if(checkPrime(i)){
                    System.out.println(i);
                }
            }
        }   
    }
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count = count+1;
                if (n/i!=i){
                    count = count+1;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static ArrayList<Integer> optimalApproach(int n){
        ArrayList<Integer> primefactors = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                primefactors.add(i);
            }
            while(n%i==0){
                n = n/i;
            }
        }
        return primefactors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("The prime factors for "+n + " are :");
        printPrime(n);

        System.out.println("The prime factors for "+n + " are :");
        ArrayList<Integer> answer = optimalApproach(n);

        for(int value:answer){
            System.out.println(value);
        }
        
    }
}