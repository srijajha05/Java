package TCSNQT;

import java.util.*;

public class octalToBinary{
    public static void findBinary(int n){
        String s ="";
        while(n!=0){
            int digit = n%10;
            String value ="";
            if(digit==0){
                s="000"+s;
            }
            while(digit!=0){
               value =Integer.toString(digit%2)+value;
                digit = digit/2;
            }
            s = value + s;
            n=n/10;
        }
        System.out.println(s);
    }
    public static int convertToBinaryFromDecimalValue(int n){
        String s = "";
        while(n!=0){
            s = Integer.toString(n%2)+s;
            n=n/2;
        }
        return Integer.parseInt(s);
    }
    public static void findOctalToDecimalToBinary(int n){
        int decimalValue=0;
        int multiplier =1;
        while(n!=0){
            int digit =n%10;
            decimalValue= decimalValue + multiplier*digit;
            multiplier = multiplier*8;
            n=n/10;
        }
        System.out.println("The decimal value for the given Octal value is : "+decimalValue);
        int answer = convertToBinaryFromDecimalValue(decimalValue);
        System.out.println("The binary value for the given Decimal value is : "+answer);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an octal value");
        int n = sc.nextInt();

        findBinary(n);
        findOctalToDecimalToBinary(n);

    }
}