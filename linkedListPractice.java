import TCSNQT.checkOddOrEven;

public class linkedListPractice {
    Node head;
    private int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int getSize(){
        return size;
    }
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public void add(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("It is an empty list");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+"-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void removeFirstElement(){
        if(head==null){
            System.out.println("It is an empty list");
            return;
        }
        size--;
        head=head.next;
    }
    public void remove(){
        if(head==null){
            System.out.println("It is an empty list");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode =lastNode.next;
            secondLastNode =secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public void insertAtIndex(int index,int data){
        if(index>size || index<0){
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(data);
        if(index==0 || head==null){
            newNode.next = head;
            head= newNode;
            return;
        }
        Node currentNode = head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currentNode.next;
                currentNode.next = newNode;
                newNode.next =nextNode;
            }
            currentNode = currentNode.next;
        }
    }
    public void reverseTheLinkedList(){
        if(head==null || head. next==null){
            return;
        }
        Node previous = head;
        Node current = head.next;
        while(current != null){
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head.next= null;
        head = previous;
    }
    public Node reverseLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        linkedListPractice list = new linkedListPractice();
        list.addAtFirst(2);
        list.addAtFirst(5);
        list.add(5);
        list.add(9);
        list.removeFirstElement();
        list.insertAtIndex(2, 3);
        list.printList();
        list.reverseTheLinkedList();
        list.printList();
        list.head = list.reverseLinkedList(list.head);
        list.printList();


    }
}
