package TCSNQT;

import java.util.*;

public class checkIfStrong {
    public static int factorial(int n){
        
        int product =1;
        for(int i=1;i<=n;i++){
            product =product*i;
        }
        return product;
    }
    public static boolean checkStrong(int a){
        int number = a;
        int sum =0;
        if(a==0){
            return false;
        }
        while(number!=0){
            int digit=number%10;
            sum =sum+factorial(digit);
            number=number/10;
        }
        if (sum==a){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value");
        int value= sc.nextInt();
        
       if(checkStrong(value)){
            System.out.println("It is an strong number");
       }
       else{
        System.out.println("It is not a strong number");
       }
       
    }
}
