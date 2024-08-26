import java.util.*;
public class LinkedListUsingCollectionsFramework{
    public static void main(String[] args) {
        LinkedList<String> myListData = new LinkedList<>();
        myListData.addFirst("is");
        myListData.addFirst("name");
        myListData.add("Srija"); //by default adds at end of the list
        myListData.addLast("Jha");
        myListData.addFirst("My");
        System.out.println(myListData);
        System.out.println(myListData.size());
        for(int i = 0;i<myListData.size();i++){
            System.out.print(myListData.get(i)+ "-->");
        }
        System.out.println("NULL");

        myListData.remove(3);
        System.out.println(myListData);
        myListData.removeFirst();
        System.out.println(myListData);
        myListData.removeLast();
        System.out.println(myListData);

    }

}