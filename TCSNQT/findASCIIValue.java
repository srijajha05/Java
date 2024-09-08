package TCSNQT;

import java.util.*;

public class findASCIIValue {
    public static void findValue(char c){
        System.out.print((int)c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char c =sc.next().charAt(0);
        findValue(c);
    }
}
