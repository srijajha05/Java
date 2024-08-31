package TCSNQT;

import java.util.*;

public class greatestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int maximumNumber = Math.max(number1,(Math.max(number2,number3)));
        System.out.println("The maximum number is "+maximumNumber);

        if(number1>number2 && number2>number3){
            System.out.println("The first number is maximum");
        }
        else if(number2>number1 && number2>number3){
        System.out.println("The second number is maximum");
        }
        else{
            System.out.println("The third number is maximum");
        }
    }
}
