public class CreatingLinkedList {
    Node head;
    private int size;
    class Node{
        String data;
        Node next;

        //whenever a node is created it is created as an individual node
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addAtFirst(String data){
        Node newNode = new Node(data); //object of node class

        //check if the LinkedList is empty
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addAtLast(String data){
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

    public void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data +"-->" );
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteAtFirst(){
        if(head==null){
            System.out.println("The LinkedList is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteAtLastNode(){
        if(head==null){
            System.out.println("The LinkedList is empty");
            return;
        }

        size--;//to be written here only to not miss any case here

        //when only one element is present in the LinkedList
        if(head.next==null){
            head=null;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast =secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public void addAtIndex(int index ,String data){
        if(index<0 || index > size){
            System.out.println("Invalid index");
            return;

        }
        size++;
        Node newNode = new Node(data);

        if(head==null || index==0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currentNode = head;

        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currentNode.next;
                currentNode.next=newNode;
                newNode.next = nextNode;

            }
            currentNode=currentNode.next;
        }
    }
    public static void main(String[] args) {
        CreatingLinkedList obj = new CreatingLinkedList();
        obj.addAtFirst("Srija");
        obj.addAtFirst("is");
        obj.addAtFirst("My name ");
        obj.addAtLast("Jha");
        obj.printList();
        obj.deleteAtFirst();
        obj.printList();
        obj.deleteAtLastNode();
        obj.printList();
        System.out.println(obj.getSize());
        obj.addAtFirst("This");
        obj.printList();
        System.out.println(obj.getSize());
        obj.addAtIndex(2,"Jha");
        obj.printList();
        
    }
    
}
