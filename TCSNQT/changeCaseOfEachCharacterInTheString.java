package TCSNQT;

import java.util.*;

public class changeCaseOfEachCharacterInTheString {
    public static void changeCaseOfString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(Character.isUpperCase(ch)){
            sb.append(Character.toLowerCase(ch));
           }
           else if(!Character.isUpperCase(ch)){
            sb.append(Character.toUpperCase(ch));
           }
           else{
            sb.append(ch);
           }
        }
        String result = sb.toString();
        System.out.println(result);

    }
    public static void usingAnotherApproach(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                sb.append((char)((int)s.charAt(i)+32));
            }
            else if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                sb.append((char)((int)s.charAt(i)-32));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        changeCaseOfString(s);
        usingAnotherApproach(s);
    }
}
