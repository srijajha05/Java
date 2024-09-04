package TCSNQT;

import java.util.*;

public class conversionOfDecimalToOctal {
    public static void convertToOctal(int n){
        int value = 0;
        int i =0;
        while(n!=0){
            int remainder = n%8;
            value = value+ (remainder* (int)Math.pow(10,i));
            i++;
            n=n/8;
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        convertToOctal(n);
    }
}
