import java.util.*;

public class convertDecimalToHexadecimal{
    public static String convertToHexadecimal(int num){
        if(num==0){
            return "0";
        }
        char [] arr ={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String s = "";
        long n = num &  0XFFFFFFFFL;
        while(n!=0){
            s= arr[(int)(n%16)]+s;
            n = n/16;
        }
        System.out.println(s);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        convertToHexadecimal(number);
    }
}