import java.util.*;

public class stackUsingCollectionFramework {
    

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(7);
        s.push(38);
        while( !s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        
    }
    

    }
}