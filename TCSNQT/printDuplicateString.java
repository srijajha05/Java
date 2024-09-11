package TCSNQT;

import java.util.*;

public class printDuplicateString {
    public static void printDuplicate(String s){
        int [] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)-'a']++;     
        }
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                System.out.println((char)(i+'a')+" - "+arr[i]);
            }
        }
    }
    public static void usingHashMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+" - "+e.getValue());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        printDuplicate(s);
        usingHashMap(s);
    }
}