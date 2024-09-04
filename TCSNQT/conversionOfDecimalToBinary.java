package TCSNQT;

import java.util.*;

public class conversionOfDecimalToBinary{

    public static void convertToBinary(int n){
        String s="";
        while(n!=0){
            if(n%2==0){
                s = s+'0';
            }
            else{
                s=s+'1';
            }
            n=n/2;
        }
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        convertToBinary(n);
    }
}