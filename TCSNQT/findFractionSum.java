package TCSNQT;

import java.util.*;

public class findFractionSum{
    public static int findHCF(int a , int b){
        if(b==0){
            return a;   
        }
        return findHCF(b,a%b);
    }
    public static void findSum(int num1,int denom1,int num2,int denom2){
        int denom3 =denom1*denom2;
        int num3 = num1*denom2 +num2*denom1;
        int gcd = findHCF(num3,denom3);
        num3 = num3/gcd;
        denom3 = denom3/gcd;
        System.out.println("The sum is "+num3+"/"+denom3);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter denom1");
        int denom1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter denom2");
        int denom2 = sc.nextInt();

        findSum(num1,denom1,num2,denom2);
    }
}