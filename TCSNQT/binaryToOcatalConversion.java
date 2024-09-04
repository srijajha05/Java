package TCSNQT;

import java.util.*;

public class binaryToOcatalConversion {
    public static void convertToOcatal(String s){
        int l = s.length();
        if(l%3==1){
            s ="00"+s;
        }
        else if(l%3==2){
            s="0"+s;
        }
        String answer="";
        for(int i=0;i<l;i=i+3){
            int number = ((s.charAt(i)-'0')*4)+((s.charAt(i+1)-'0')*2)+((s.charAt(i+2)-'0')*1);
            answer =answer+Integer.toString(number);
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary value");
        String s = sc.next();
        

        convertToOcatal(s);
    }
}
