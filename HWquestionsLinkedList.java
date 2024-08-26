import java.util.*;
public class HWquestionsLinkedList {
    Node head;
    private int size;
    class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public int getSize(){
        return size;
    }
    public void addAtLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;

        }
        currentNode.next = newNode;

    }
    public void printLinkedList(){
        if(head == null){
            System.out.println("The linked list is empty");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" --> ");
            currentNode = currentNode.next;

        }
        System.out.println("NULL");
    }
    public int search(int x){
        Node currentNode = head;
        int index = 0;
        while(currentNode != null){
            if(currentNode.data == x){
                return index;
            }
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
/*
        HWquestionsLinkedList obj = new HWquestionsLinkedList();
        obj.addAtLast(1);
        obj.addAtLast(5);
        obj.addAtLast(7);
        obj.addAtLast(3);
        obj.addAtLast(8);
        obj.addAtLast(2);
        obj.addAtLast(3);
        obj.printLinkedList();
        System.out.println("Found at index " + obj.search(7));
*/
        System.out.println("Enter the size of linked list");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter values less than 50 in the linked List");

        for(int i = 0;i<s;i++){
            System.out.println("Enter the value of element at "+i+"th index of LinkedList");
            int val = sc.nextInt();
            list.add(val);
        }
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if((int)list.get(i)>25){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println(list.size());



       

        
    }
    
}
