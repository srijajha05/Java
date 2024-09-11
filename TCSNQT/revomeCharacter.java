package TCSNQT;

import java.util.*;

public class revomeCharacter {
    public static void removeS2fromS1(String s, String s1){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.remove(s1.charAt(i));
            }
        }
        System.out.println(map);
    }
    public static void optimizedHashMap(String s, String s1){
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i), 1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        removeS2fromS1(s1,s2);
        optimizedHashMap(s1,s2);
        
    }
}
