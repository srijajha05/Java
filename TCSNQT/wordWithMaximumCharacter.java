package TCSNQT;

import java.util.*;

public class wordWithMaximumCharacter {
    public static void findMaximum(String s) {
        String sb = new String();
        int length = 0;
        String longestWord = "";
        int maximum = Integer.MIN_VALUE;
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb= sb+(s.charAt(i));  
                length++;
            } else {
                if (length > maximum) {  
                    maximum = length;
                    longestWord = sb; 
                }
                sb="";  // Reset the string builder for the next word
                length = 0;  // Reset the length for the next word
            }
        }
    
        // Handle the last word in the string (if there's no space at the end)
        if (length > maximum) {
            longestWord = sb;
        } 
        System.out.println(longestWord);
    }

    public static void findMaximumBetter(String s){
        StringBuilder sb = new StringBuilder();
        int length =0;
        int maximum = Integer.MIN_VALUE;
        String myWord ="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                length++;
                sb.append(s.charAt(i));
            }
            else{
                if(length>maximum){
                    maximum = length;
                    myWord = sb.toString();
                }
                sb.setLength(0);
                length =0;
            }
        }
        if(length >maximum){
            myWord = sb.toString();
        }
        System.out.println(myWord);
    }
    public static void findMaximumUsing2Pointer(String s){
        int i=0;
        int j=0;
        int max_start = 0;
        int max_length=0;
        
        while(j<=s.length()){
            if (j<s.length() && s.charAt(j)!=' '){
                j++;
            }
            else{
                int currentLength =j-i;
                if(max_length<currentLength){
                    max_length=currentLength;
                    max_start =i;
                }
                j++;
                i=j;                
            }
        }
        String longestWord=s.substring(max_start, max_length+max_start);
        System.out.println(longestWord);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        findMaximum(s);
        findMaximumBetter(s);
        findMaximumUsing2Pointer(s);
        
    }
}
