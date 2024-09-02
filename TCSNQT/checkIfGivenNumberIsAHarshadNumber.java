package TCSNQT;

import java.util.*;

public class checkIfGivenNumberIsAHarshadNumber {
    public static void checkIfHarshadNumber(int n){
        int number =n;
        int sum =0;
        while(number!=0){
            int digit = number%10;
            sum = sum+digit;

            number=number/10;

        }
        if(n%sum==0){
            System.out.println("It is a Harshad Number");
        }
        else{
            System.out.println("It is not a Harshad Number");
        }
    }

    public static void checkIfHarshadNumberUsingString(int n){
        String s = Integer.toString(n);
        int sum =0;
        for(int i=0;i<s.length();i++){
            sum += s.charAt(i)-'0';
        }
        if(n%sum==0){
            System.out.println("It is a Harshad Number");
        }
        else{
            System.out.println("It is not a Harshad Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        checkIfHarshadNumber(n);
        checkIfHarshadNumberUsingString(n);
        
    }
    
}
