package TCSNQT;

import java.util.*;

public class checkAutomorphic {
    public static boolean check(int a){
        int number = a;
        int sqaure = a*a;
        while(number!=0){
            if(number%10 == sqaure%10){
                return true;
            }
            number =number/10;
            sqaure= sqaure/10;
    }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is automorphic");
        int n = sc.nextInt();

        if(check(n)){
            System.out.println("It is automorphic");
        }
        else{
            System.out.println("It is not automorphic");
        }
    }
}
