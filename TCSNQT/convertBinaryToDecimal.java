package TCSNQT;

import java.util.*;

public class convertBinaryToDecimal {
    public static void convertToDecimal(String s){
        int l = s.length();
        int number =0;
        int multiplier =1;
        for(int i =l-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                number = number+multiplier;
            }
            multiplier=multiplier*2;
        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary value");
        String s = sc.next();

        convertToDecimal(s);
    }
}