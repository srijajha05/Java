package TCSNQT;

import java.util.*;

public class totalWords {
    public static void words(String s){
        int count = 1;
        if(s.charAt(s.length()-1)==' '){
            count =0;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }     
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        words(sentence);
    } 
}


