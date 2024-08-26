import java.util.*;

public class queueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(9);
        q.add(5);
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
