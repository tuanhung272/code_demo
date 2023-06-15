package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // decToBin(11);
        MyStack myStack = new MyStack(6);

        myStack.push(new Node(2));
        myStack.push(new Node(3));
        myStack.push(new Node(4));
        myStack.push(new Node(7));
        myStack.push(new Node(9));
        myStack.push(new Node(88));
            System.out.println("Stack bandau");
        myStack.print();
            System.out.println("Element top");
        Node x = myStack.topEl();
        x.print();
        myStack.pop();
            System.out.println("Ngan xep sau khi lay ra 1 phan tu");
        myStack.print();
    }

    public static void decToBin(int k){
        MyStack s = new MyStack(10);
        while (k > 0){
            s.push(new Node(k % 2));
            k = k / 2;
        }
        System.out.println("Binary: ");
        while (!s.isEmpty()){
            Node node = s.pop();
            node.printInfo();
        }
    }

}
