package TCSNQT;

import java.util.*;

public class occurenceOfCharacterInAString{
    public static void findOccurence(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);
    }
    public static String SortMyString(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void anotherApproach(String s){
        s = SortMyString(s);
        char ch = s.charAt(0);
        int count =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
            else{
                System.out.print(ch);
                System.out.print(count+" ");
                count = 1;
                ch = s.charAt(i);
            }
            
        }
        //for last character count printing
        System.out.print(ch);
        System.out.print(count+" ");

    }
    public static void usingFrequencyArray(String s){
        int [] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]!=0){
                System.out.print((char)(i+'a'));
                System.out.print(frequency[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();
        findOccurence(s);
        anotherApproach(s);
        System.out.println();
        usingFrequencyArray(s);

    }
}