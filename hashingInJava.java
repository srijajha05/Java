import java.util.HashSet;
import java.util.Iterator;

public class hashingInJava {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //adding elements to the hashset --> O(1) time complexity
        set.add(1);
        set.add(2);
        set.add(3);

        //seraching an element in the hashset --> O(1) time complexity
        if(set.contains(1)){
            System.out.println("Element is present in the array");
        }

        //deleting an element in the hashset --> O(1) time complexity 
        set.remove(1);

        //printing all the hashset
        System.out.println(set);

        //Iterator in HashSet
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
