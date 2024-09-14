package TCSNQT;

import java.util.*;

public class findIndexOfSubstring {
    public static void findIndex(String mainString,String subString){
        mainString=mainString.toLowerCase();
        subString=subString.toLowerCase();
        for(int i=0;i<=mainString.length()-subString.length();i++){
            int j=0;
            for(j=0;j<subString.length();j++){
                if(mainString.charAt(i+j)!=subString.charAt(j)){
                    break;
                }
            }
            if(j==subString.length()){
                System.out.println("The substring is present at "+i);
                return;
            }
        }
        System.out.println("The substring is not present");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Enter the substring to find");
        String s2 = sc.nextLine();
        findIndex(s,s2);
        System.out.println(s.indexOf(s2));
    }
}
