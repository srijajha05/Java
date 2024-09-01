package TCSNQT;

import java.util.*;

public class findingLCMOf2Numbers {
    public static void findLCM(int n1, int n2){
        int value =Math.max(n1, n2);
        while(value%n1!=0 || value%n2!=0){
            value = value+1;
        }
        System.out.println(value);
    }
    public static int findGCD(int n1,int n2){
        while(n2!=0){
            int remainder= n1%n2;
            n1=n2;
            n2=remainder;
        }
        return n1;
    }
    public static void optimalApproach(int n1,int n2){
        int GCD = findGCD(n1, n2);
        int product = n1*n2;
        System.out.println(product/GCD); 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1= sc.nextInt();

        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        findLCM(n1,n2);
        optimalApproach(n1,n2);
    }
}
