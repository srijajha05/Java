package TCSNQT;

import java.util.*;

public class checkPalindrome{
    public static void checkIfPalindrome(String s){
        s= s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("It is not a palindrome");
                return;
            }
        }
        System.out.println("It is a palindrome");
    }

    public static void optimalApproach(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            char left = s.charAt(l);
            char right  = s.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
            }
            else if(!Character.isLetterOrDigit(right)){
                r--;
            }
            else if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                System.out.println("It is not a palindrome");
                return;
            }
            else{
                l++;
                r--;
            }
        }
        System.out.println("It is a palindrome");
    } 
    public static void usingRecursion(int index ,String s ){
        s=s.toLowerCase();
        if(index>s.length()/2){
            System.out.println("It is a palindrome");
            return;
        }
        if(s.charAt(index)!=s.charAt(s.length()-1-index)){
            System.out.println("It is not a palindrome");
            return;
        }
        usingRecursion(index+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        checkIfPalindrome(s);
        optimalApproach(s);
        usingRecursion(0,s);    
    }
}