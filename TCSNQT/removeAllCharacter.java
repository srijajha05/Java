package TCSNQT;

import java.util.*;

public class removeAllCharacter{
    public static void removeUnnecessaryCharacters(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                str.append(c);
            }
            
        }
        String result = str.toString();
        System.out.println(result);
    }
    public static void anotherApproach(String s){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(((int)c>=65 && (int)c<=90 )||((int)c>=97 &&(int)c<=122)){
                str.append(c);
            }
            
        }
        String result = str.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of characters here:");
        String s = sc.nextLine();
        removeUnnecessaryCharacters(s);
        anotherApproach(s);
    }
}