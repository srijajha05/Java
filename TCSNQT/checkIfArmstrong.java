package TCSNQT;

import java.util.*;



public class checkIfArmstrong {
    public static void check(int n){
        int length = 0;
        int temp=n;
       while(temp!=0){   
        temp=temp/10;
        length++;
       }
       double sum = 0;
       int number = n;
       while(number>0){
        int num = number%10;
        number=number/10;
        double val =Math.pow(num, length);
        sum = sum+val;
       }
       if(sum==n){
        System.out.println("The given number is an armstrong number");
       }
       else{
        System.out.println("The given number is not an armstrong number");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        check(number);
        
    }
}