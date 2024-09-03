package TCSNQT;

public class findAreaOfCircle {
    public static void findArea(double r){
        double area = (22/7) *(r*r);
        System.out.println(area);
    }
    public static void main(String[] args) {
        double r = 4.0;
        findArea(r);
    }
}