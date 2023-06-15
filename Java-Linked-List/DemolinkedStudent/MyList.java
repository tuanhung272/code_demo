package DemolinkedStudent;

import java.util.Scanner;
public class MyList {
    private Node head;
    private Node tail;

    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public void traverse(){
        Node currentNode = head;
        while(currentNode !=null){
            currentNode.printData();
            currentNode = currentNode.next;
        }
    }
    public void addFirst(Node node) {
        node.next = head;
        head = node;
    }

    public void removeById(int id){
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.getStudent().getStudentId() == id) {
            head = head.getNext();
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current.getStudent().getStudentId() == id) {
                previous.setNext(current.getNext());
                return;
            }

            previous = current;
            current = current.getNext();
        }

        System.out.println("No student with the given ID found in the linked list.");
    }
    public int size(){
        int count = 0;
        Node current = head;
        while (current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public Node get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public boolean editById(int StudentID){
        for (int i = 0; i < size(); i++){
            Node node = get(i);
            Student student = node.getStudent();
            if (student.getStudentId() == StudentID) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new Student Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter new Student Age: ");
                int newAge = sc.nextInt();
                sc.nextLine();

                student.setStudentName(newName);
                student.setStudentAge(newAge);

                return true;
            }
        }
        return false;
    }

    public Student findStudentById(int id) {    
        Node current = head;
        while (current != null) {
            if (current.getStudent().getStudentId() == id) {
                return current.getStudent();
            }
            current = current.getNext();
        }
        return null;
    }
}
