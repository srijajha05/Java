package TCSNQT;

import java.util.*;

public class checkIfGivenYearIsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an year ");
        int yr = sc.nextInt();

        if(yr%400==0 || (yr%100 !=0 && yr%4==0) ){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
        
    }
}
