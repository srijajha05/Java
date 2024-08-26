import java.util.*;

public class Srija{
public static void main(String[] args) {
   /* 
    int a = 97;
    System.out.println(a);
    System.out.print("Enter your name:");
    //scanner class imported
    //input taken by System.in
    Scanner sc = new Scanner(System.in);
    //next take only one word 
    String name = sc.next();
    //nextLine takes whole line as Input
    //nextInt is used to take integer as Input
    System.out.println("Hello "+ name);
    */
    /* 
    System.out.println("Enter 1st Number");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();

    System.out.println("Enter 2nd Number");

    int num2 = sc.nextInt();

    if (num2 > num1){
        System.out.println("2nd Number is greater");
    }
    else if (num1 > num2){
        System.out.println("1st number is greater");
    }
    else{
        System.out.println("both are equal");
    }
    */
   /*  System.out.println("Enter button number");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch (button) {
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Namaste");
            break;
        case 3:
            System.out.println("Bonjour");
            break;
        default:
            System.out.println("Invalid button pressed");
            break;
    }*/
    System.out.println("Enter your number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i =1; i<=10;i++){
        System.out.println(num*i);
    }
}
}