class Overloading{
    public  void displayInfo(int age){
        System.out.println(age);
    }
    public void displayInfo(String name){
        System.out.println(name);
    }
    
}


public class methodOverloadingInJava {
    
    public static void main(String[] args) {
        Overloading h = new Overloading();
        h.displayInfo(5);
    }
    
}
