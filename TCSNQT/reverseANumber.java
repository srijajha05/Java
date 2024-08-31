package TCSNQT;

import java.util.*;

public class reverseANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reversedNumber = 0;
        while(number!=0){
            reversedNumber = reversedNumber*10 +number%10;
            number = number/10;
        }
        System.out.println(reversedNumber);

    }
}
