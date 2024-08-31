package TCSNQT;

import java.util.*;

public class findingMaximumAndMinimumDigitInANumber {

    public static void find(int number){
        ArrayList<Integer> a = new ArrayList<>();
        while(number!=0){
            a.add(number%10);
            number = number/10;
        }
        
        int maximum = a.get(0);
        int minimum = a.get(0);
       
            for(int i=0;i<a.size();i++){
                if(a.get(i)>maximum){
                    maximum = a.get(i);
                }
                if(a.get(i)<minimum){
                    minimum = a.get(i);
                }
            }
       System.out.println("The maximum digit is "+maximum+" and the minimum digit is "+minimum);
    }

    public static void optimizedFind(int number){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        while (number!=0){
            int value = number%10;
            if(value>maximum){
                maximum = value;
            }
            if(value<minimum){
                minimum = value;
            }
            number = number/10;
        }
        System.out.println("The maximum digit is "+maximum+" and the minimum digit is "+minimum);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        find(number);
        optimizedFind(number);
    }
}
