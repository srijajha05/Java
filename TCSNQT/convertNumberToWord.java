package TCSNQT;

public class convertNumberToWord {
    public static void convertNumIntoWord(String str) {
        String[] singleDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensMultiple = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] tensPower = {"hundred", "thousand"};

        if(str.length()==0){
            return;
        }
        if (str.length() == 1) { 
            System.out.println(singleDigit[str.charAt(0) - '0']); 
            return;
        }

        for (int i = 0, len = str.length(); i < str.length(); i++) {
            if (len > 2) {
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(singleDigit[str.charAt(i) - '0'] + " " + tensPower[len - 3] + " ");
                    len--;
                }
            } 
            else {
                if (str.charAt(i) - '0' == 1) { 
                    System.out.print(twoDigits[str.charAt(i + 1) - '0']);
                    return;
                }
                if (str.charAt(i) - '0' != 0) {
                    System.out.print(tensMultiple[str.charAt(i) - '0'] + " ");
                }
                if (str.charAt(i + 1) - '0' != 0) {
                    System.out.print(singleDigit[str.charAt(i + 1) - '0']);
                    return;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        convertNumIntoWord("1239");
    }
}