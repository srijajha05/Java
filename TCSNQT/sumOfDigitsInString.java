package TCSNQT;

import java.util.*;

public class sumOfDigitsInString {
    public static void findSum(String s){
       int sum =0;
       int currentNumber =0;
       for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(Character.isDigit(c)){
            currentNumber = currentNumber* 10 +( c-'0');
            
        }
        else{
            sum = sum +currentNumber;
            currentNumber =0;
        }
       }
       sum = sum+currentNumber;
       System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();
        findSum(s);
    }
}
