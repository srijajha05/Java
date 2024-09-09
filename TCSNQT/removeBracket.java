package TCSNQT;

import java.util.*;

public class removeBracket {
    public static void remove(String s ){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')' && s.charAt(i)!='{' && s.charAt(i)!='}' && s.charAt(i)!='[' && s.charAt(i)!=']'){
                sb.append(s.charAt(i));
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an expression with brackets to remove");
        String s = sc.nextLine();
        remove(s);
    }
}