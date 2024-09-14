package TCSNQT;

import java.util.*;

public class reverseWordsInAString {
	public static void reversemyString(String s){
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(c ==' '){
				if(sb.length()>0){
					stack.push(sb.toString());
					sb.setLength(0);
				}	
			}
			else{
				sb.append(c);
			}
		}
		if(sb.length()>0){
			stack.push(sb.toString());
		}
		
		StringBuilder reversedWord = new StringBuilder();
		while(!stack.isEmpty()){
			reversedWord.append(stack.pop());
			reversedWord.append(" ");
		}
		String answer = reversedWord.toString();
		System.out.println(answer);
	}
	public static void otherApproach(String s){
		int left = 0;
		int right = s.length() - 1;

		String temp = "";
		String answer = "";

		//Iterate the string and keep on adding to form a word
		//If empty space is encountered then add the current word to the result
		while (left <= right)
		{
			char ch = s.charAt(left);
			if (ch != ' '){
				temp += ch;
			}
			else if (ch == ' '){
				if (!answer.equals("")){
					answer = temp + " " + answer;
				}
				else{
					answer = temp;
				}
				temp = "";
			}
			left++;
		}

		//If not empty string then add to the result(Last word is added)
		if (!temp.equals("")){
			if (!answer.equals("")){
				answer = temp + " " + answer;
			}
			else{
				answer = temp;
			}
		}
		System.out.println(answer);
}	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		reversemyString(s);
		otherApproach(s);
	}
    
}
