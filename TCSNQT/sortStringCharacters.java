package TCSNQT;

import java.util.*;

public class sortStringCharacters {
    public static void sortMyString(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);//as arr.toString() does not give actual values it returns the address
        System.out.println(result);
    }
    public static void otherApproach(String s){
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String answer = new String(arr);
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sortMyString(s);
        otherApproach(s);
    }
}
