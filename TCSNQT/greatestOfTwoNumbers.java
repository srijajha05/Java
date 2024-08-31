package TCSNQT;

import java.util.*;

public class greatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        int maximumNumber = Math.max(number1, number2);
        System.out.println("The maximum nuber is "+maximumNumber);

        if(number1>number2){
            System.out.println("The first number is greater");
        }
        else{
            System.out.println("The second number is greater");
        }
    }
}
