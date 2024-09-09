package TCSNQT;

import java.util.*;

public class reverseAStringInJava {
    public static void reverse(String s){
        StringBuilder str = new StringBuilder(s);
        int start =0;
        int end = str.length() -1;
        while(start<end){
            char st = str.charAt(start);
            char en = str.charAt(end);
            str.setCharAt(start, en);
            str.setCharAt(end, st);
            start++;
            end--;
        }
        String answer = str.toString();
        System.out.println(answer);
    }
    public static void reverseUsingStack(String s){
        Stack<Character> stackOfString = new Stack<>();
        for(int i=0; i<s.length();i++){
            stackOfString.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stackOfString.isEmpty()){
            sb.append(stackOfString.pop());
        }
        String result = sb.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        reverse(s);
        reverseUsingStack(s);
    }
}