class Student{
    String name;
    int age;

    void printInfo(){
        System.out.println("Name:"+name+" and Age:"+age);
    }
    //non parameterized constructor
    Student(){
        System.out.println("Inside non parameterized constructor");
    }
    //parameterized constructor
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
}


public class constructorsInJava {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "p";
        s1.age = 21;

        Student s2 = new Student("abc",21);

        Student s3 = new Student(s2);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        
    }
}
