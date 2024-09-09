package TCSNQT;

import java.util.*;

public class capitalizeFirstAndLastLetter {
    public static void capitalize(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i =0 ;i<s.length();i++){
            if((i==0  || i==s.length()-1) && (int)s.charAt(i) >=97) {
                sb.setCharAt(i, (char)((int)s.charAt(i)-32));
            }
            else if(s.charAt(i)==' '){
                if(((int)s.charAt(i-1)-32) >65){
                    sb.setCharAt(i-1, (char)((int)s.charAt(i-1)-32));
                }
                if(((int)s.charAt(i+1)-32) > 65){
                    sb.setCharAt(i+1, (char)((int)s.charAt(i+1)-32));
                }
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        capitalize(s);
    }
}
