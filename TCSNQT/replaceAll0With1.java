package TCSNQT;

import java.util.*;

public class replaceAll0With1 {
    public static void replace(int n){
        if(n<0){
            n=Math.abs(n);
        }
        if(n==0){
            System.out.println(1);
            return;
        }
        int newNumber = 0;
        int multiplier =1;
        while(n!=0){
            int digit = n%10;
            if(digit==0){
                digit=1;
            }
            
            newNumber = digit*multiplier+newNumber;
            n=n/10;
            multiplier = multiplier*10;
        }
        System.out.println(newNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        replace(n);
        
    }
}
