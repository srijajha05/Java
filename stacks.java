public class stacks{
    private static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stackFromLinkedList{
        public static Node head = null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void pushData(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop deletes the top element of the list and returns its data
        public static int popData(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top; 
        }

        public static int peekData(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        stackFromLinkedList s = new stackFromLinkedList();
        s.pushData(2);
        s.pushData(9);
        s.pushData(7);

        while(!s.isEmpty()){
            System.out.println(s.peekData());
            s.popData();
        }
        
    }
}
