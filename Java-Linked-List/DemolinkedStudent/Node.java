package DemolinkedStudent;

public class Node {
    Student info;
    Node next;

    public Node(Student info) {
        this.info = info;
        this.next = null;
    }

    public void printData() {
        info.printInfo();
    }

    public Student getStudent() {
        return this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    /*
        public boolean hasStudent(int studentId) {
            return this.info.getStudentId() == studentId;
        }
    */
}
