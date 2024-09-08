package TCSNQT;

import java.util.*;

public class removeAllVowelsFromThString {
    public static void replaceVowel(String s){
        s=s.toLowerCase();
        String newString ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;            
            }
            else{
                newString += c;
            }
        }
        System.out.println(newString);
    }
    public static void optimalApproach(String s){
        s= s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                s=s.substring(0, i)+s.substring(i+1);
            } 
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        replaceVowel(s);
        optimalApproach(s); 
    }
}
