package queue_chap;

// all about lq = linear queue
public class LQ {
    int front;
    int rear;
    int[] queue;
    int capacity;
    int size;

// constructor 
    public LQ(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
//isfull and isempty condition 
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = data;
            size++;
        }
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
            int item = queue[front++]; //kina else rakhena say 
            size--;
            return item;
    }

    // checking size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LQ q1 = new LQ(4);
        q1.enqueue(10);
        q1.enqueue(12);
        q1.enqueue(20); 
        q1.enqueue(30);
        q1.enqueue(50);
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Dequeued: " + q1.dequeue());
        System.out.println("Current size: " + q1.size());
    }
}
