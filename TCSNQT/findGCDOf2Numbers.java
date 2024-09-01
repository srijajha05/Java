package TCSNQT;

import java.util.*;

public class findGCDOf2Numbers {
    public static void findGCD(int n1,int n2){
                ArrayList<Integer> a = new ArrayList<>();
                for(int i=1;i<=n1;i++){
                    if(n1%i==0){
                        a.add(i);
                    }
                }
                ArrayList<Integer> b = new ArrayList<>();
                for(int i=1;i<=n2;i++){
                    if(n2%i==0){
                        b.add(i);
                    }
                }
                int maximum = Integer.MIN_VALUE;
                for(int i=0;i<a.size();i++){
                    
                    for(int j=0;j<b.size();j++){
                        if(a.get(i)==b.get(j)&& a.get(i)>maximum){
                            maximum = a.get(i);
                        }
                    }
                }
                System.out.println(maximum);          
    }
    public static void findGCDInLessTimeComplexity(int n1,int n2){
        int gcd =1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            
            if(n1%i==0 && n2%i==0){
                gcd =i;
            }
        }
        System.out.println(gcd);
    }

    public static void findGCDInLessTimeComplexityBetter(int n1,int n2){
        
        for(int i=Math.min(n1,n2);i>=1;i--){
            
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(1);
    }

    public static void optimalApproach(int a , int b){
        while(b!=0 ){
            int remainder = a%b;
            a=b;
            b=remainder;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1= sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        findGCD(num1,num2);
        findGCDInLessTimeComplexity(num1,num2);
        findGCDInLessTimeComplexityBetter(num1, num2);
        optimalApproach(num1,num2);
        
    }
}
