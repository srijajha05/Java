import java.util.* ;
public class advanced_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a = sc.nextInt();

        //Butterfly Pattern
/*     
        // 1st Half
        for(int i=1; i<= a;i++){
            for(int j=1; j <= i ;j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2*(a-i) ; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half 
        for(int i=a; i>= 1;i--){
            for(int j=i; j >= 1;j--){
                System.out.print("*");
            }
            for(int j=a-i; j>= 1; j--){
                System.out.print(" ");
            }
            for(int j=a-i; j >= 1 ;j--){
                System.out.print(" ");
            }
            for(int j=i; j >= 1 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
*/

    //Solid Rhombus
    /*
    for (int i = 1;i<=a;i++){
        for(int j=1;j<= (a-i); j++){
            System.out.print(" ");
        }
        for(int j=1;j<= a; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    */
    
    // Print the pyramid pattern 
    /* 
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5
   

    for(int i=1; i<=a;i++){
        for(int j=1;j<= a-i ;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){ 
                System.out.print(i + " "); 
        }
        System.out.println();
    }
*/

//Palindromic Pattern
/*
      1
    2 1 2
   3 2 1 2 3
  4 3 2 1 2 3 4 
 5 4 3 2 1 2 3 4 5 
 */
/*
for(int i=1; i<=a;i++){
    for(int j=1;j<= a-i ;j++){
        System.out.print(" ");
    }
    for(int j = i ;j>=1; j-- ){
        System.out.print(j+" ");
        }
    for(int j = 2 ;j<=i ; j++ ){
        System.out.print(j+" ");
        //If j started from 1
        // if(j==1){
        //     continue;
        // }
        // else{
        //     System.out.print(j+" ");
        // }
        
        }
    System.out.println();
}  
*/

//Diamond Pattern
/*
for(int i=1; i<=a;i++){
    for(int j=1;j<= a-i ;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=(2*i)-1;j++){ 
            System.out.print("*"); 
    }
    System.out.println();
}
for(int i=a; i>=1;i--){
    for(int j=a-i;j>= 1;j--){
        System.out.print(" ");
    }
    for(int j=(2*i)-1;j>=1;j--){ 
            System.out.print("*"); 
    }
    System.out.println();
}
*/

//Hollow Butterfly
/*
for(int i=1; i<= a;i++){
    for(int j=1; j <= i ;j++){
        if(j==1 || j== i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        
    }
    for(int j=1; j<= 2*(a-i) ; j++){
        System.out.print(" ");
    }
    
    for(int j=1; j <= i ;j++){
        if(j==1 || j== i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
// 2nd Half 
for(int i=a; i>= 1;i--){
    for(int j=i; j >= 1;j--){
        if(j==1 || j== i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    for(int j=a-i; j>= 1; j--){
        System.out.print(" ");
    }
    for(int j=a-i; j >= 1 ;j--){
        System.out.print(" ");
    }
    for(int j=i; j >= 1 ;j--){
        if(j==1 || j== i){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
*/

//Hollow Rhombus
/*
for (int i = 1;i<=a;i++){
    for(int j=1;j<= (a-i); j++){
        System.out.print(" ");
    }
    for(int j=1;j<= a; j++){
        if(j==1|| j==a || i==1 || i == a){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        
    }
    System.out.println();
}
*/


//Pascal's Triangle
/* 
for(int i=0; i<a;i++){
    int sum = 1;

    for(int j=0;j< a-i ;j++){
        System.out.print(" ");
    }
    
    for(int j=0;j<=i;j++){ 
        System.out.print(sum + " " );
        sum = sum * (i-j)/(j+1) ;
    }
    System.out.println();
}
*/

//Half Pyramid
/*
for(int i=1; i<=a;i++){
    for(int j=1;j<= a-i ;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){ 
        System.out.print(j + " " ); 
    }
    System.out.println();
}
*/

//Inverted Half Pyramid
/* 
for (int i = 1 ; i<=a; i++){
    for(int j = (a-i+1); j>=1; j--){
        System.out.print(i);
    }
    System.out.println("");
}
*/
    }
}
