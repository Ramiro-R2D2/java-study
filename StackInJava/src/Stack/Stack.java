package Stack;
public class Stack {
    Node top;
    int height;
    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop(){
        if (top == null) {
            System.out.println("Empty Stack");
            } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight(){
        if (top == null) {
            System.out.println("Empty Stack");
        }
        else{
            System.out.println("Height: " + height);
        }
    }

    public void println(){
        if (top == null) {
            System.out.println("Empty Stack");
        }
        else{
            Node tempNode = top;
            while (tempNode != null) {
                System.out.println(tempNode.value);
                tempNode = tempNode.next;
            }
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
            height++;
        }
    }

    public Node pop(){
        if(height == 0){
            return null;
        }
        Node tempNode = top;
        top = top.next;
        tempNode.next = null;
        height--;
        
        return tempNode;
    }
}
