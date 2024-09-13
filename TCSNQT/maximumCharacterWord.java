package TCSNQT ;

import java.util.*;

public class maximumCharacterWord{
    public static void findMaxRepeatingCharWord(String s){
        int higestMaxCount =0;
        String maxWord ="";

        int start =0;//index of current word
        for(int i=0;i<=s.length();i++){
            if(i==s.length()|| s.charAt(i)==' '){//checks the end of the word
                String word = s.substring(start, i);
                int [] freq = new int[256];//all ASCII character
                int maxCount =0;
                for(char c :word.toCharArray()){
                    freq[c]++;
                    maxCount = Math.max(maxCount, freq[c]);
                }
                if(maxCount>higestMaxCount){////checking if the word has maximum count of repeating characters or not
                    higestMaxCount=maxCount;
                    maxWord =word;
                }
                start =i+1;//updating the start index for next round
            }
        }
        System.out.println(maxWord);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence of multiple words");
        String sentence = sc.nextLine();
        findMaxRepeatingCharWord(sentence);
    }
}
