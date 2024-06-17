package Exemple;
public class Queue {
    Node first;
    Node last;
    int length;
    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
    }
        public int getNode(){
            return this.value;
        }
 }
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }
    public int getFrist(){
        if (first != null) {
            return first.value;
        }
        return 0;
    }

    public int getLast(){
        if (last != null) {
            return last.value;
        }
        return 0;
    }
    public void println(){
        Node tempNode = first;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }
    public void getLength(){
        if(length > 0){
            System.out.println(length);
        }
        else{
            System.out.println("Empty queue");
        }
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last  =  newNode;
        }
        else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue(){
        if(length == 0) return null;
        Node tempNode = first;
        if (length == 1) {
            first = null;
            last = null;
        }
        else{
            first = first.next;
            tempNode.next = null;
        }
        length--;
        return tempNode;
    }
}
