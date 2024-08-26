public class circularQueueFromArray {
    static class myQueue{
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    myQueue(int size){
        this.size = size;
        arr = new int[size];
        
    }
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    public static boolean isFull(){
        return (rear+1)%size == front;
    }

    public static void addToQueue(int data){
        if(isFull()){
            System.out.println("Overflow");
            return;
        }
        if(front==-1){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear]= data;

    }

    public static int removeFromQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = arr[front];
        if(front==rear){//only one elemnt present
            front=rear=-1;
        }
        else{
            front=(front+1)%size;

        }
        
        return result;
    }

    public static int peekTheQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        myQueue q = new myQueue(5);
        q.addToQueue(9);
        q.addToQueue(2);
        q.addToQueue(7);

        while(!q.isEmpty()){
            System.out.println(q.removeFromQueue());
        }

    }
    
}
}
