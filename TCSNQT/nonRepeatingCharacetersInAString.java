package TCSNQT;

import java.util.*;

public class nonRepeatingCharacetersInAString {
    public static void find(String s){
        s=s.toLowerCase();
        int [] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || (!Character.isLetter(s.charAt(i)))){
                continue;
            }
            frequency[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]==1){
                System.out.println((char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        find(s);
    }
}
