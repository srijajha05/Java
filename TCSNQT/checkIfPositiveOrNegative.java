package TCSNQT;

import java.util.*;

public class checkIfPositiveOrNegative {
    public static void check(int n){
        if(n<0){
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is a positive number");
        }
    }
    public static void checkUsingBitwiseOperator(int n){
        
        if(n >> 31==0){
            System.out.println("It ia a positive number");
        }
        if(n >> 31==-1){
            System.out.println("It is a negative number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        check(n);
        checkUsingBitwiseOperator(n);
    }
}
