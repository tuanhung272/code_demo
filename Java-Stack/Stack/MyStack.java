package Stack;

public class MyStack {
    public Node[] a;
    int top, max;

    public MyStack(int max){
        top = -1;
        this.max = max;
        a = new Node[max];
        // push() - đưa phần tử lên đầu
        // pop() - lấy phần tử trên cùng
        // isEmpty() - Kiểm tra stach rỗng
        // topEl() - Trả về phần từ trên cùng
        // Rỗng: top = -1
        // Đầy: top = max - 1
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if(top == max - 1){
            return true;
        }else {
            return false;
        }
    }

    public void push(Node x){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            top++;
            a[top] = x;
        }
    }
    public Node pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            Node node = a[top];
            top--;
            return node;
        }
    }
    public Node topEl(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else {
            Node x = a[top];
            return x;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++){
            a[i].printInfo();
        }

    }
    // Các phương thức khác của StackArray

    //    public boolean isFull() {
    //        return top == stack.length - 1;
    //    }

}
