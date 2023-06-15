package Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(5);
        mq.enqueue(new Node(1));
        mq.enqueue(new Node(2));
        mq.enqueue(new Node(3));
        mq.enqueue(new Node(4));
        mq.enqueue(new Node(5));
        System.out.println("Hang doi sau khi enqueue");
        mq.print();
        mq.enqueue(new Node(6)); 
        System.out.println("Hang doi sau khi dequeue");
        mq.dequeue();
        mq.print();
    }
}
