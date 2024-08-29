package TCSNQT;

import java.util.*;

public class checkIfPerfect {
    public static boolean isPerfect(int n){
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum = sum +list.get(i);
        }
        
        if(n==sum){
            return true;
        }
        
        return false;
    }

    public static boolean checkPerfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
               sum = sum +i;
            }
        }
        if(n==sum){
            return true;
        }
        
        return false;
    }
    public static boolean optimizedCheck(int n){

        int sum = 0;
        for(int i=1;i*i <=n;i++){
            if(n%i==0){
                if((i*i==n)||i==1){
                    sum = sum +i;//here only 1 factor exists
                }
                else{
                    sum = sum +i+n/i;//both factors added
                }
            }
        }
        if(n==sum){
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        

        if(isPerfect(n)){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
        
        if(checkPerfect(n)){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }

        if(optimizedCheck(n)){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
            
        

    }
}

