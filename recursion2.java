import java.util.*;
public class recursion2 {
/*
    //Tower Of Hanoi
    public static void towerOfHanoi(int n , String Source, String Destination , String Helper) {
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, Source, Helper, Destination);
        System.out.println("Moving "+n +"th disk from "+ Source+ " to "+ Destination);
        towerOfHanoi(n-1, Helper, Destination, Source);
    }
*/

/*
    //String Reversal
    public static void stringRev(String a, int n) {
        if (n<0){
            return;
        }
        System.out.print(a.charAt(n));
        stringRev(a, n-1);
    }
*/
/*
    //Occurance of element -- first and last index
    public static int first =-1;
    public static int last = -1;

    public static void occurance(char a , String str , int x) {

        if(x<0){
            return;
        }
        if(str.charAt(x)==a){
            if(last==-1){
                last = x;
            }
            else{
                first = x;
            }
        }
        occurance(a, str, x-1);    
    }
*/
/* 
    //Check if array is sorted
    public static boolean arrayisSorted(int arr[],int n){
        if(n== arr.length -1){
            return true;
        }
        if(arr[n]<arr[n+1]){
            return arrayisSorted(arr, n+1);
        }
        else{
            return false;
        }
    }
*/
/* 
    //moving all x to the end
    public static String newString = "";
    public static int count = 0;
    public static void moveallX(String str, int index) {
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString += 'x' ;
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(index)=='x'){
            count++;
            moveallX(str, index+1);
        }
        else{
            newString = newString + str.charAt(index);
            moveallX(str, index+1);
        }
    }
*/
/*
    //removing all duplicate strings
    public static boolean map[] = new boolean [26];
    public static String newString = "";
    public static void removeDuplicate(String str, int index){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true){
            removeDuplicate(str, index+1);
        }
        else{
            newString += currentChar;
            map[currentChar -'a'] = true;
            removeDuplicate(str, index+1);
        }
        
    }
*/
/* 
    //finding subsequences
    public static void findingSubsequences(String str, int index, String newString){

        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);

        //to be
        findingSubsequences(str, index+1, newString+currentChar);

        //not to be
        findingSubsequences(str, index+1, newString);
}
*/
/*
    //finding subsequences using hashset
    public static void findingSubsequencesUsingHash(String str, int index, String newString , HashSet<String> set){

        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }
            set.add(newString);
            System.out.println(newString);
            return;
        
        }
        char currentChar = str.charAt(index);

        //to be
        findingSubsequencesUsingHash(str, index+1, newString+currentChar,set);

        //not to be
        findingSubsequencesUsingHash(str, index+1, newString,set);
    }
*/
/* 
    //printing keypad combination
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str, int index , String combination) {
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar -'0'];
        for(int i =0;i<mapping.length();i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
*/
      public static void main(String[] args) {
        /* 
        System.out.println("Enter the disks in the rod ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the source rod, destination rod and helper rod");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        towerOfHanoi(n,a,b,c);
        */
/*
        System.out.println("Enter the string to be reversed");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringRev(str,(str.length()-1));
*/
       
/* 
        occurance('a',"Srijaaa","Srijaaa".length()-1);
        System.out.println("The first Occurance is at "+first+"th index and last occurance is at "+last+"th index.");
*/

/*
        int arr[] = {1,2,3,4,5,6,7,8,9};
        if(arrayisSorted(arr,0)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
*/

/* 
        String str = "axbcxxd";
        moveallX(str,0);
*/

        // removeDuplicate("srijaaaaaaa",0);

        //findingSubsequences("abc",0,"");

    /*
        HashSet<String> set = new HashSet<>();

        findingSubsequencesUsingHash("aaa",0,"",set);
    */
        /* 
        String str = "4";
        printCombination(str,0,"");
        */
      }

}
