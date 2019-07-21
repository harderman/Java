package DS;

import Interface.IDoubleLinked;
//不带头双向不循环链表
public class MyDoubleLickList implements IDoubleLinked {
    class Node{
        private Node next;
        private int data;
        private Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head = null;
    private Node last = null;
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node ;
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }

    private Node SearchIndex(int index){
        Node cur = this.head;
        int MyIndex = 0;
        while(cur !=null){
            if(MyIndex == index){
                return cur;
            }
            MyIndex++;
            cur = cur.next;
        }
        return null;
}
    @Override
    public boolean addindex(int index, int data) {
        if(index < 0||index>getLength()){
            return false;
        }
        if(index == 0){
            addFirst(data);
            return true;
        }
        if(index == getLength()){
            addLast(data);
            return true;
        }
        Node cur = SearchIndex(index);
        if(cur == null){
            throw new UnsupportedOperationException("The Wrong Index!!!");
        }
        Node node = new Node(data);
        node.next = cur.next;
        cur.next.prev = node;
        node.prev = cur;
        cur.next = node;
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int remove(int key) {
//        if(this.head.data == key){
//            this.head = this.head.next;
//        }else if(this.last.data == key){
//            this.last = this.last.prev;
//            this.last.next = null;
//        }
//        Node cur = this.head;
//        while(cur != null){
//            if(cur.data == key){
//                break;
//            }
//            cur = cur.next;
//        }
//        if(cur == null){
//            return -1;
//        }else {
//            cur.prev.next = cur.next;
//            cur.next.prev = cur.prev;
//            return key;
//        }
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            if(cur.data == key) {
                count = key;
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = this.last.prev;
                    }
                    return count;
                }
            }
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public void removeAllKey(int key) {
//        Node cur = this.head;
//        while (cur != null){
//            if(cur.data == key){
//                cur.prev.next = cur.next;
//                cur.next.prev = cur.prev;
//            }
//            cur = cur.next;
//        }
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
        while(this.head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head =cur;
        }
    }


    public static void main(String[] args) {
        MyDoubleLickList myDoubleLickList = new MyDoubleLickList();
        myDoubleLickList.addFirst(2);
        myDoubleLickList.addFirst(3);
        myDoubleLickList.addFirst(4);
        myDoubleLickList.addFirst(5);
        myDoubleLickList.addFirst(5);
        myDoubleLickList.addLast(5);
        myDoubleLickList.display();
        System.out.println("****************************");
        myDoubleLickList.addindex(1,6);
        myDoubleLickList.display();
        System.out.println("****************************");
        myDoubleLickList.remove(6);
        myDoubleLickList.display();
        System.out.println("****************************");
        myDoubleLickList.removeAllKey(5);
        myDoubleLickList.display();
    }
}