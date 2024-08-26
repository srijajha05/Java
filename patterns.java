import java.net.SocketPermission;
import java.util.*;
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // System.out.println("Enter the number of rows");
        // int a = sc.nextInt();
        // System.out.println("Enter the number of columns");
        // int b = sc.nextInt();
        
    //Solid Rectangle
    /*
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns");
        int b = sc.nextInt();

         for(int i = 0 ; i<a ; i++){
            for(int j = 0 ;j<b ; j++ ){
            System.out.print("*");
            }
            System.out.println(" ");
        }
     */

    //Hollow Rectangle
    /*   
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns");
        int b = sc.nextInt();

        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ;j<b ; j++ ){
                if (i==0 || i== (a-1) || j==0 || j == (b-1) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
            */ 

    //Half Pyramid
    /*
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();
        
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ;j<=i ; j++ ){
            System.out.print("*");
            }
            System.out.println(" ");
        }
     */

    //Inverted Half Pyramid
  /*
    System.out.println("Enter the number of rows");
    int a = sc.nextInt();
    
    for(int i = a ; i>=0 ; i--){
        for(int j = 0 ;j<i ; j++ ){
        System.out.print("*");
        }
        System.out.println(" ");
    }
*/

//Inverted Half Pyramid (rotated by 180 degree)
/* 
System.out.println("Enter the number of rows");
int a = sc.nextInt();

for(int i = 0 ; i<a ; i++){
    for(int j = 0 ;j < a-i ; j++ ){
        System.out.print(" ");
    }
    for(int j = 0 ;j <= i ; j++ ){
        System.out.print("*");
    }
    
    System.out.println();
}
*/
//Half Pyramid with numbers
/*  
    System.out.println("Enter the number of rows");
    int a = sc.nextInt();
        
        for(int i = 1 ; i<=a ; i++){
            for(int j = 1 ;j<=i ; j++ ){
            System.out.print(j+" ");
            }
            System.out.println(" ");
        }
*/  

// Inverted Half Pyramid
/*
System.out.println("Enter the number of rows");
int a = sc.nextInt();
    
    for(int i = 1 ; i<=a ; i++){
        for(int j = 1 ;j<=a-i+1 ; j++ ){
        System.out.print(j+" ");
        }
        System.out.println(" ");
    }
 */

 //Floyd's Triangle
/*
    System.out.println("Enter the number of rows");
    int a = sc.nextInt();
    int num = 1;
        for(int i = 1 ; i<=a ; i++){
            for(int j = 1 ;j<=i ; j++ ){
            System.out.print(num + " ");
            num++ ;
            }
            System.out.println(" ");
        }
*/
//0-1 Triangle
/*
    System.out.println("Enter the number of rows");
    int a = sc.nextInt();
        
        for(int i = 1 ; i<=a ; i++){
            for(int j = 1 ;j<=i ; j++ ){
                int sum = i+j;

            if(sum % 2 == 0){
                System.out.print("1");

            }
            else{
                System.out.print("0");
            }
            }
            System.out.println(" ");
        }
*/
    }
}
