package TCSNQT;

import java.util.*;

public class printSpellingOfNumber {
    public static void giveSpelling(String s){
        String [] singleDigit ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String [] twoDigits ={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String [] tensMultiple={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
        String [] tensPower ={"hundred","thousand"};

        if(s.length()==0){
            return;
        }
        if(s.length()==1){
            System.out.println(singleDigit[s.charAt(0)-'0']);
            return;
        }
        for(int i=0,len=s.length();i<s.length();i++){
            if(len>2){
                if(s.charAt(i)-'0' !=0){
                    System.out.print(singleDigit[s.charAt(i)-'0']+" "+tensPower[len-3]+" ");
                }
                len--;
            }
            else{
                if((s.charAt(i)-'0')==1){
                    System.out.print(twoDigits[s.charAt(i)-'0']+" ");
                    return;
                }
                if(s.charAt(i)-'0'!=0){
                    System.out.print(tensMultiple[s.charAt(i)-'0']+" ");
                }
                if(s.charAt(i+1)-'0' != 0){
                    System.out.print(singleDigit[s.charAt(i)-'0']+" ");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        String s = sc.next();

        giveSpelling(s);
    }
}
