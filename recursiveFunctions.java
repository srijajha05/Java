import java.util.* ;
public class recursiveFunctions {
    public static void printReverseNum(int x) {
        if(x==0){
            return ;
        }
        System.out.println(x);
        printReverseNum(x-1);
        
    }

    public static void printStraight(int x) {
        if(x<=0){
            return ;
        }
        //just put recursion above print statement
        printStraight(x-1);
        System.out.println(x);
        
    }
    public static int sum(int a) {
       if(a != 0){
        return a + sum(a-1);
       }
       else{
        return a;
       }
    }
    public static int factorial(int n) {
        if (n > 0){
            return n *  factorial(n-1);
        }
        else{
            return 1 ;
        }
       
     }
    /* 
    static int a = 0;
    static int b= 1;
    static int c = 0;
    public static void fibonacci(int n) {
        if(n>0){
            int c = a + b;
            a =b;
            b=c;
            System.out.print(c+ ",");
            fibonacci(n-1);
        }  
    }
    */
    public static int power(int x , int n){
        
        if(n>0){
            int c = x * power(x, n-1);
            return c;
        }
        // else if (x==0){
        //     return 0;
        // }
        else{
            return 1;
        }
    }

    //stack height = log n

    public static int shPower(int x , int n){
        
        if(n<=0){
            return 1;
        }
        if(x%2 == 0){
            int c = shPower(x, n/2) * shPower(x, n/2);
            return c;
        }
        else{
            int c = shPower(x, n/2) * shPower(x, n/2) * x;
            return c;
        }
    }

    public static void main(String[] args) {
        // System.out.println("Enter the number ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("The output is :");
        // printReverseNum(n);
        // System.out.println("Your acsending output is:");
        // printStraight(n);

        // int val = sum(n);
        // System.out.println(val);

        // int fact = factorial(n);
        // System.out.println(fact);

        
        // System.out.print(a + "," + b +"," );
        // fibonacci(n-2);


        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the power ");
        
        int n = sc.nextInt();

        System.out.println(power(x,n));

    }
}
