package DemoSinglyLinkedList;
public class Node {
    int info;
    Node next;

    public Node(int info, Node next){
        this.info = info;
        this.next = next;

    }

    public Node(int info){
        this.info = info;
        this.next = null;
    }
}
