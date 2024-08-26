public class queueFromLinkedList {
    static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null && tail==null;  
        }
        public static void addToQueue(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail=newNode;
        }
        public static int removeFromQueue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return val;
            
        }

        public static int peekTheQueue() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
            
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.addToQueue(9);
        q.addToQueue(8);
        q.addToQueue(1);
        while(!q.isEmpty()){
            System.out.println(q.peekTheQueue());
            q.removeFromQueue();
        }
    }
}
