import java.util.*;

public class ABCD {
    public static void pushAtBottomOfTheStack( Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottomOfTheStack(s,data);
        s.push(temp);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottomOfTheStack(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(7);
        s.push(38);
        reverseStack(s);
        while( !s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }
}
