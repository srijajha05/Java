package TCSNQT;

import java.util.*;

public class checkIfANumberIsPrime {
    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean optimizedCheck(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number");
        int number = sc.nextInt();
       /* if(checkPrime(number)){
            System.out.println("The given number is a prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }
        if(optimizedCheck(number)){
            System.out.println("The given number is a prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }
        */
        System.out.println(5%4);
    }
}
