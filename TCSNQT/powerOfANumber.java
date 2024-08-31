package TCSNQT;

import java.util.*;

public class powerOfANumber {
    public static void findValue(int n,int p){
        long temp =Math.abs(p);
        double value = 1.0;
        while(temp>0){
            if(temp%2==0){
                n = n*n;
                temp = temp/2;
            }
            else{
                value = value *n;
                temp--;
            }
        }
        if(p<0){
            System.out.println(1.0/value);
        }
        else{
            System.out.println(value);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Enter a power");
        int p = sc.nextInt();

        findValue(n,p);
    }
}
