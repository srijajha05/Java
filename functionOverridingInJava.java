class Fruits{
    void cost(){
        System.out.println("My cost is 10");
    }
}
class Apple extends Fruits{
    int a = 70;
    void cost(){
        System.out.println("My cost is 100");
    }
}
class KashmiriApples extends Apple{
    void cost(){
        System.out.println("My cost is "+a);
    }
}

public class functionOverridingInJava {
    public static void main(String[] args) {

        KashmiriApples a = new KashmiriApples();
        a.cost();
        
    }
}
