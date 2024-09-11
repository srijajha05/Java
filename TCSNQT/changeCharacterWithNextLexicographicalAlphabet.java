package TCSNQT;

import java.util.*;

public class changeCharacterWithNextLexicographicalAlphabet {
    public static void codeTheString(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='z'){
                sb.append('a');
            }
            else if(s.charAt(i)=='Z'){
                sb.append('A');
            }
            else if ((s.charAt(i)>'a'&&s.charAt(i)<'z')  || (s.charAt(i)>'A'&& s.charAt(i)<'Z')){
                sb.append((char)(s.charAt(i)+1));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        codeTheString(s);
    }
}