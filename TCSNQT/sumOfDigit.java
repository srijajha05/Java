package TCSNQT;

import java.util.*;

public class sumOfDigit {
    public static void findSum(int n){
        int sum =0;
        while(n!=0){
            sum =sum +n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        findSum(n);
    }
}
