import java.util.*;
public class functionsExercise {
    public static int printAvg(int a , int b, int c){
        return (a+b+c)/3;
    }
    public static double findCircumference(int r){
        return (2* 3.14 * (r));
    }
    public static void voteEligibility(int age){
        if(age>=18){
            System.out.println("You can vote ");
        }
        else{
            System.out.println("You can not vote");
        }
        
    }
    public static int findGreatest (int a , int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int sumOdd(int a){
       int sum = 0;
       for(int i = 1 ; i<=a; i++){
       if (i%2 == 0){
        sum = sum + 0;
       } 
       else{
        sum = sum + i ;
       }
    }
       return sum;
    }
    public static void infiniteLoop(){
         int num = 1 ;
        do{
            System.out.println(num);
            num++;
        }while(true);
    }
    public static void count(int a) {
       
        int positive = 0;
        int negavite = 0;
        int zero = 0;
        
            for(int i = 1 ; i<=a ; i++){
                if(i>0){
                    positive++;
                }
                else if (i<0){
                    negavite++;
                }
                else{
                    zero++ ;
                } 
            }
        
        System.out.println("Positives: "+ positive + " Negatives: " + negavite + " Zeros: " + zero);
    }
    public static double findValue(double a , double b) {
        return Math.pow(a,b) ;
        
    }
    public static void fibonacci(int n) {
        int i=2;
        int a = 0; 
        int b = 1;
        System.out.print(a + " , " + b );
        while(i<n){
            int c = a + b;
            System.out.print(" , " + c );

            a=b;
            b=c;
            
            i++;
        }
        
    }
    public static void main(String[] args) {
        //System.out.println("The average is " + printAvg(9,8,7));
        //System.out.println("The sum of all odd numbers till 9 are " + sumOdd(9));
        //System.out.println("The greatest of them is:" + findGreatest(90,11) );
        //System.out.println("The circumference od circle with radius r is " + findCircumference(7));
        //voteEligibility(20);
        //infiniteLoop();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        // count(a);
        // System.out.println(findValue(4,2));

        // fibonacci(9);

    }
}
