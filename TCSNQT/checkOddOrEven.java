package TCSNQT;

import java.util.*;

public class checkOddOrEven {

    public static void check(int number){
        if(number%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static void checkNewApproach(int number){
        if((number&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        check(number);
        checkNewApproach(number);
    }
}
