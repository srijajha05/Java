public class queueFromArray {
    static class myQueue{
        static int arr[];
        static int size;
        static int rear;

        myQueue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }

        public static boolean isFull(){
            return rear==size-1;
        }

        public static void addToQueue(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            rear++;
            arr[rear]= data;

        }

        public static int removeFromQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peekTheQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    
    public static void main(String[] args) {
        myQueue q = new myQueue(5);
        q.addToQueue(9);
        q.addToQueue(2);
        q.addToQueue(7);

        while(!q.isEmpty()){
            System.out.println(q.peekTheQueue());
            q.removeFromQueue();
        }

    }
}
