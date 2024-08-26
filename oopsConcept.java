/*class Pen{
    String colour;
    String Brand;

    public void write(){
        System.out.println("The pen is writing");
    }

    public void printColour(){
        System.out.println(this.colour);
    }
}*/

/*
class A{
    private String password;
    void setPassword(String str){
        password = str;
    }
    void getPassword(){
        System.out.println(password);
    }
}*/

/*
abstract class Animal{
    abstract void makeSound();
    Animal(){
        System.out.println("Creating an animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    void makeSound(){
        System.out.println("Hihhh Hiih Hih");
    }
}
*/

/*
interface A {
    void eat();
    void drink();
}
interface B{
    void sleep();
}

class C implements A,B{
    public void eat(){
        System.out.println("C eats");
    }
    public void drink(){
        System.out.println("C drinks");
    }
    public void sleep(){
        System.out.println("C sleeps");
    }
}
*/
class Student{
    static String schoolName;
    String name;
}
public class oopsConcept{
    
    public static void main(String[] args) {
/*
        Pen Renoylds = new Pen();//object of Pen class is created

        Renoylds.Brand="Abc";
        Renoylds.colour="Blue";

        Pen clickPen = new Pen();
        clickPen.Brand="pqr";
        clickPen.colour="Light Blue";

        clickPen.printColour();
        Renoylds.printColour(); 
*/
/* 
        A obj = new A();
        obj.setPassword("Srija");
        obj.getPassword();
*/
/*
        Horse h = new Horse();
        h.makeSound();
*/
/*
        C obj = new C();
        obj.drink();
        obj.eat();
        obj.sleep();

        System.out.println(a);
*/

    Student.schoolName = "St.Thomas";
    Student s1 = new Student();
    Student s2 = new Student();
    s1.name="Srija";
    s2.name ="Jha";
    System.out.println(s1.schoolName);
    System.out.println(s2.schoolName);





    }
}