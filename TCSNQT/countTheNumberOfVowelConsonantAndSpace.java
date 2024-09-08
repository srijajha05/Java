package TCSNQT;

import java.util.*;

public class countTheNumberOfVowelConsonantAndSpace {
    public static void check(String s){
        s= s.toLowerCase();
        int vowels=0;
        int consonants =0;
        int spaces =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                spaces +=1;
            }
            else if(c=='a' ||c=='e'|| c=='i'||c=='o'||c=='u'){
                vowels +=1;
            }
            else if(c>'a' && c<='z'){
                consonants +=1;
            }
            
        }
        System.out.println("The total number of vowels are "+vowels+" the total number of consonants are "+consonants+" and the total number of spaces are "+spaces);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to check number of vowels , consonants and spaces present in it");
        String s = sc.nextLine();
        check(s);
        
    }
}
