package DemoSinglyLinkedList;

public class MyList {
    Node head, tail;

    public MyList(){
        head = tail = null;

    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void add(int x){
        Node q = new Node(x);
        if(isEmpty()){
            head = tail = q;
        }else {
            tail.next = q;
            tail = q;
        }
    }

    public void addMany(int[] a){
        for (int i : a){
            add(i);
        }
    }
    public void traverse(){
        Node p = head;
        while(p != null){
            if(p == tail){
                System.out.print(p.info + ".");
                p = p.next;

            }
            if (p == head){
                System.out.printf(p.info + ",");
                p = p.next;

            }
        }
    }
}
