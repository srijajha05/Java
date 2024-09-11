package TCSNQT;

import java.util.*;

public class removeDuplicateFromString {
    public static void removeDuplicatesInString(String s){
        s=s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        String answer = set.toString();
        System.out.println(answer);       
    }
    public static void usingBooleanArray(String s){
        StringBuilder sb = new StringBuilder();
        boolean [] arr = new boolean[26];
        for(int i=0;i<s.length();i++){
            if(arr[(int)(s.charAt(i)-'a')]==false){
                sb.append(s.charAt(i));
                arr[(int)(s.charAt(i)-'a')]=true;
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        removeDuplicatesInString(s);
        usingBooleanArray(s);
    }
}
