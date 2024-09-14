package TCSNQT;

import java.util.*;

public class reverseAString {
    public static void reverse(String s1){
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        reverse(s);
        
    }
}
