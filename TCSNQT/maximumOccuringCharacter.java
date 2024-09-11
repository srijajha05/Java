package TCSNQT;

import java.util.*;

public class maximumOccuringCharacter{
    public static void findMaximumOccuringCharacter(String s ){
        s=s.toLowerCase();
        int [] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                continue;
            }
            frequency[s.charAt(i)-'a']++;
        }
        int maximum = Integer.MIN_VALUE;
        char ch ='$';
        for(int i=0;i<frequency.length;i++){
            if(maximum<frequency[i]){
                maximum =frequency[i];
                ch= (char)(i+'a');
            }
        }
        System.out.println(ch);
        System.out.println(frequency[(int)ch-'a']);
    }
    public static String sortMyString(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void otherApproach(String s){
        s=sortMyString(s);
        int count =1;
        int maximum =0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }
            else{
                if(count>maximum){
                    maximum= count;
                }
                count =1;    
            }
            if(count>maximum){
                maximum= count;
                System.out.println(s.charAt(i-1));
            }                  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st = sc.nextLine();
        findMaximumOccuringCharacter(st);
        otherApproach(st);
    }
}