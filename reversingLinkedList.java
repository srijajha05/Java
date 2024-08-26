

public class reversingLinkedList {
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
    public void reverseMyList(){
        Node previousNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            //update the nodes to move forward in the list
            previousNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;
        head = previousNode; //as previousNode has reached the end of te list
    }
    public Node reverseLinkedListUsingRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseLinkedListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        reversingLinkedList list = new reversingLinkedList();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.printLinkedList();

        list.head = list.reverseLinkedListUsingRecursion(list.head); //mandatory to save list like this as head
        list.printLinkedList();

    }
}
