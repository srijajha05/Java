package TCSNQT;

import java.util.*;

public class removeSpacesFromString {
    public static void removeSpacesFromInputString(String s){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                s=s.substring(0, i)+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
    public static void optimalApproach(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                result.append(s.charAt(i));
            }
        }
        String resultString = result.toString();
        System.out.println(resultString);
    }
    public static int removeSpaces(char [] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != ' '){
                arr[count] =arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        removeSpacesFromInputString(s);
        optimalApproach(s);
        char[] str = s.toCharArray();
        int count = removeSpaces(str);
        System.out.println(String.valueOf(str).subSequence(0, count));
    }
}
