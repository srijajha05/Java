package TCSNQT;

import java.util.*;

public class findSubstringInAGivenString {
    public static void checkSubstring(String s1, String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.contains(s2)){
            System.out.println("The substring is present");
        }
        else{
            System.out.println("The substring is not present");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        checkSubstring(s1,s2);
        
    }
}
