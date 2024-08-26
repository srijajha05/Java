public class backtracking{

    public static void printPermutations(String str, String permutation, int index) {

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPermutations(newString, permutation+currentChar, i+1);
        }
    
    }
    public static void main(String[] args) {
        printPermutations("abc", "", 0);
    }
}

