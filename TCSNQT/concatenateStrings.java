package TCSNQT;

import java.util.*;

public class concatenateStrings{
    public static void concatenate(String s1,String s2){
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
        System.out.println(new StringBuilder(s1).append(s2));
    }
    
    public static void customConcatStrings(String s1,String s2){
        char [] arr1 =s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        char [] arr = new char[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[arr.length-arr1.length+i]=arr2[i];
        }
        String s = new String(arr);
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        concatenate(s1,s2);
        customConcatStrings(s1,s2);
    }
}