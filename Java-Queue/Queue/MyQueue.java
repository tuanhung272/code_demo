package Queue;

public class MyQueue {
    public int max;
    public int first, last;

    Node[] a;
    public MyQueue(int max){
        this.max = max;
        a = new Node[max];
        first = last = -1;

    }
    public boolean isFull(){
        return (first == 0 && last == max - 1);
    }

    public boolean isEmpty(){
        return (first == -1);
    }

    public void enqueue(Node x){
        if(isFull()){
            System.out.println("FULL");
        }else {
            last = (last + 1) % a.length;
            a[last] = x;
        }
    }

    public Node dequeue(){
        if (isEmpty()){
            System.out.println("EMPTY");
            return null;
        }else {
            Node node = a[first];
            first++;
            return node;
        }
    }

    public void print(){
        for (int i = 0; i < max; i++){ 
            if (a[i] != null){
                a[i].printData();
            }
        }
    }

}
