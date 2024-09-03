package TCSNQT;

public class findRootsOfQuadraticEquation {
    public static void findRootsForTheEquation(double a ,double b , double c){
        if(a==0){
            System.out.println("Invalid roots");
            return;
        }
        double d = b*b - (4*a*c);
        double sqrt = Math.sqrt((Math.abs(d)));
        if(d>0){
            double root1 = (-b +sqrt)/(2*a);
            double root2 = (-b -sqrt)/(2*a);
            System.out.println("The roots are :");
            System.out.println(root1);
            System.out.println(root2);

        }
        else if (d==0){
            double root1 = (-b +sqrt)/(2*a);
            double root2 = (-b -sqrt)/(2*a);
            System.out.println("The roots are equal:");
            System.out.println(root1);
            System.out.println(root2);

        }
        else{
            System.out.println("The roots are complex:");
            System.out.println((-b/(2*a))+ " + "+(sqrt/(2*a))+"i");
            System.out.println((-b/(2*a))+ " - "+(sqrt/(2*a))+"i");
        }
    }
    public static void main(String[] args) {
        double a = 1;
        double b =1;
        double c =1;
        findRootsForTheEquation(a,b,c);
        
    }
}
