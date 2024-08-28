package TCSNQT;
import java.util.*;
public class checkIfPalindrome {
    public static boolean checkPalindrome(int n){
        if(n<0||(n!=0 && n%10==0)){
            return false;
        }
        int half= 0;
        while(half<n){
            half = half*10+n%10;
            n=n/10;
        }
        if(half==n||half/10==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = sc.nextInt();
        if(checkPalindrome(number)){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}
