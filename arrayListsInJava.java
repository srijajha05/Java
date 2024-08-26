import java.util.ArrayList;
import java.util.Collections;

public class arrayListsInJava {
    public static void main(String[] args) {
        ArrayList<Integer> abcd = new ArrayList<>();
        
        //Adding elements to ArrayList
        abcd.add(500);
        abcd.add(25);
        abcd.add(51);
        System.out.println(abcd);

        //Getting the value of element at a particular index in ArrayList
        int x = abcd.get(2);
        System.out.println(x);

        //Adding an element in between the ArrayList
        abcd.add(2,92);
        System.out.println(abcd);

        //Changing an element in ArrayList
        abcd.set(2,95);
        System.out.println(abcd);

        //Deleting an element at any index in the ArrayList
        abcd.remove(2);
        System.out.println(abcd);

        //Finding the size of ArrayList
        int size = abcd.size();
        System.out.println("The size of the ArrayList is "+size);

        //Iterating each element in the ArrayList
        for(int i = 0;i<size;i++){
            System.out.print(abcd.get(i)+ " ");
        }
        System.out.println();

        //Sorting the ArrayList
        Collections.sort(abcd);
        System.out.println(abcd);

    }
}
