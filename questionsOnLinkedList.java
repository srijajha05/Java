public class questionsOnLinkedList {
    Node head;
    
    class Node{
        
        char data;
        Node next;

        Node(char data){
            this.data = data ;
            this.next = null;
        }
    }
    public void addToList(char data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return ;
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
    public Node removeFromLast(Node head , int index){
        if(head.next ==null){
            return null;
        }
        int size = 0;
        Node currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.next;
            size++;
        }

        //if you want to remove (n==size) node from last ---> you want to remove head ---> just return head.next as head
        if(index==size){
            return head.next;
        }

        int indextoFind = size - index ;
        Node previousNode = head;
        int currentPosition = 1;

        while(currentPosition !=indextoFind){
            previousNode = previousNode.next;
            currentPosition++;
        }

        previousNode.next = previousNode.next.next;
        return head;


    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public Node reverseList(Node head){
        Node previous = null;
        Node current = head;
        while(current != null){
            Node next = current.next;

            current.next = previous;

            //updating the values
            previous = current;
            current = next;

        }
        
        return previous;
    
    }
    public boolean isPanlindrome(Node head){
        if(head==null || head.next == null){
            return true;
        }
        Node firstHalfStart = head;
        Node firstHalfEnd = findMiddle(head);
        Node secondHalfStart = reverseList(firstHalfEnd.next);
        while(secondHalfStart != null){
            if(secondHalfStart.data != firstHalfStart.data){
                return false;
            }
            secondHalfStart =secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
        return true;
    }
    public boolean hasACycle(Node head){
        if(head==null || head.next == null){
            return false;

        }
        Node hare = head;
        Node turtle = head;
        while(hare!=null && hare.next!= null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        questionsOnLinkedList obj = new questionsOnLinkedList() ;
        obj.addToList('c');
        obj.addToList('d');
        obj.addToList('e');
        obj.addToList('e');
        obj.addToList('d');
        obj.addToList('c');
        obj.printLinkedList();
        // obj. head = obj.removeFromLast(obj.head,2);
        // obj.printLinkedList();
        // obj.head = obj.reverseList(obj.head);
        // obj.printLinkedList();
        if(obj.isPanlindrome(obj.head)==true){
            System.out.println("LinkedList is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        if (obj.hasACycle(obj.head)){
            System.out.println("LinkedList has a cycle");
        }
        else{
            System.out.println("LinkedList does not have a cycle");
        }

        
    }
}
