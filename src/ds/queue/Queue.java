package ds.queue;

public class Queue {
    private int maxSize; //initializes the first number of slots
    private long[] queArray; // slots to main the data
    private int front; // index position for the element in front
    private  int rear; // this is going to be the index position for the last element
    private int nItems; // counter to maintain the number of items in our queu

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;// index position of first slot in the array
        rear = -1; // there is not item in array yet to be consider as last item
        nItems = 0; // WE DON't have elements in the array yet
    }
        public void insert(long j){
        if(rear == maxSize -1){
            rear = -1;
        }
            rear++;
            queArray[rear] = j;
            nItems++;
        }

        public long remove(){
        // remove item from the front of the line
           long temp = queArray[front];
           front++;
           if(front == maxSize){
               front = 0;
           }
           nItems--;
           return temp;
        }

        public long peekFront(){
        return queArray[front];
        }

        public boolean isEmpty(){
        return (nItems == 0);
        }

        public boolean isFull(){
        return  nItems == maxSize;
        }

        public void view(){
            System.out.print("[ ");
            for(int i = 0; i < queArray.length; i++){
                System.out.print(queArray[i] + " ");
            }
            System.out.print("]");
        }
    }

