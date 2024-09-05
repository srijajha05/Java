package TCSNQT;

import java.util.*;

public class octalToDecimal {
    public static int findDecimal(int n){
        int value =0;
        int i=0;
        while(n!=0){
            int digit =n%10;
            value = value+digit*(int)Math.pow(8,i);
            i++;
            n=n/10;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an octal value");
        int n = sc.nextInt();

        System.out.println(findDecimal(n));
    }
}
