import java.util.ArrayList;

public class stacksUsingArrayList {
    static class myStack{
    static ArrayList<Integer> intList = new ArrayList<>();
    public static boolean isEmpty(){
        return intList.size() == 0;
    }
    public static void pushData(int data){
        intList.add(data);
    }
    public static int popData(){
        if(isEmpty()){
            return -1;
        }
        int top = intList.get(intList.size()-1);
        intList.remove(intList.size()-1);
        return top;
    }
    public static int peekData(){
        if(isEmpty()){
            return -1;
        }
        return intList.get(intList.size()-1);
    }
    }
    public static void main(String[] args) {
        myStack s = new myStack();
        s.pushData(2);
        s.pushData(9);
        s.pushData(53);
        while(!s.isEmpty()){
            System.out.println(s.peekData());
            s.popData();
        }
    }
}
