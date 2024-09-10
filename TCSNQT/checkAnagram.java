package TCSNQT;

import java.lang.reflect.Array;
import java.util.*;

public class checkAnagram {
    public static boolean checkIfAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int len = s1.length();
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
            }
            else{
                map1.put(s1.charAt(i), 1);
            }
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i), map1.get(s2.charAt(i))+1);
            }
            else{
                map2.put(s2.charAt(i), 1);
            }
        }
        for(int i=0;i<len;i++){
            char ch = s1.charAt(i);
            if(!map1.containsKey(ch) || !map2.containsKey(ch) || map1.get(ch)!=map2.get(ch)){
                return false;
            }
        }
        return true;
    }
    public static String sortString(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void otherApproach(String s1 , String s2){
        if(s1.length()!=s2.length()){
            System.out.println("It is not an anagram");
            return;
        }
        s1 = sortString(s1);
        s2 = sortString(s2);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("It is not an anagram");
                return;
            }
        }
        System.out.println("It is an anagram");
    }
    public static void otherApproachUsingFrequencyArray(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("It is not an anagram");
            return;
        }
        s1= s1.toLowerCase();
        s2 = s2.toLowerCase();
        int [] frequency = new int[26];
        for(int i=0;i<s1.length();i++){
            frequency[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            frequency[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]!=0){
                System.out.println("It is not an anagram");
                return;
            }
        }
        System.out.println("It is an anagram");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 =sc.next();
        System.out.println("Enter second string");
        String s2 = sc.next();
        if(checkIfAnagram(s1,s2)){
            System.out.println("The strings are anagrams of each other");
        }
        else{
            System.out.println("The strings are not anagrams of each other");
        }
        otherApproach(s1,s2);
        otherApproachUsingFrequencyArray(s1,s2);
    }
}
