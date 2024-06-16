package Exemples;

public class linkedList {
    private Node head;
    private Node tail;
    private int length;
    public class Node{
        public String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }
    public linkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }
    public void getTail(){
        if(this.tail == null){
            System.out.println("Empty List");
        }else{
            System.out.println(tail.data);
        }
    }
    public void getHead(){
        if(this.tail == null){
            System.out.println("Empty List");
        }else{
            System.out.println(head.data);
        }
    }
    public void getLength(){
        System.out.println("Length: " + this.length);
    }
    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }
    public void print(){
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public Node get(int index){
        if(index <0 || index >= length) return null;
        Node tempNode = head;
        for( int i = 0; i<index; i++){
            tempNode = tempNode.next;
        }
        return tempNode;
    }
    public boolean set(int index, String data){
        Node tempNode = get(index);
        if (tempNode != null) {
            tempNode.data = data;
            return true;
        }
        return false;
    }
    public void apprend(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next  = newNode;
            tail = newNode;
        }
        length++;
    }
    public void prepend(String data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public Node removeLast(){
        if (length == 0) return null;
        Node pre = head;
        Node tempNode = null;
        while (pre.next != tail) {
            pre = pre.next;
        }

        tempNode = tail;
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return tempNode;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node tempNode = head;
        head = head.next;
        tempNode.next = null;
        length--;
        if (length ==0) {
            head = null;
            tail = null;
        }
        return tempNode;
    }
    public boolean insert(int index, String data){
        if(index < 0 || index > length)return false;
        if(index == 0){
            prepend(data);
            return true;
        }
        if(index == length){
            apprend(data);
            return true;
        }
        Node newNode = new Node(data);
        Node tempNode = get( index - 1);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index <0 || length>=length)return null;
        if(index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node prev = get(index - 1);
        Node tempNode = prev.next;
        prev.next = tempNode.next;
        tempNode.next = null;
        length--;
        return tempNode;
    }
}
