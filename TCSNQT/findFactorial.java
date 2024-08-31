package TCSNQT;

import java.util.*;

public class findFactorial {
    public static int findFactorialOfN(int n){
        if(n<1){
            return 1;
        }
        return n*findFactorialOfN(n-1);
    }
    public static void printFactorial(int n){
        int value =1;
        for(int i=1;i<=n;i++){
            value = value*i;
        }
        System.out.println("The factorial is "+ value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int n = sc.nextInt();

        System.out.println(findFactorialOfN(n));
        printFactorial(n);
    }
    
}
