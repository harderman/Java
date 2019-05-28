package com.bittech.hello;
public class MyDoubleLickList implements IDoubleLinked{
    class Node{
        private Node next;
        private Node prev;
        private int data;
        public Node(int data){
            this.next = null;
            this.data = data;
            this.prev = null;
        }
    }
    Node head = null;
    Node last = null;
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            this.head.prev = node;
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
//        Node cur = this.head;
        if(this.head == null){
            this.head = node;
            this.last = node;
        }
//        while(cur.next != null){
//            cur = cur.next;
//        }
//        cur.next = node;
//        node.prev = cur;
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }
    public void checkIndex(int index){
        if(index < 0||index > getLength()){
            throw new UnsupportedOperationException("非法插入");
        }
    }

    public Node searchIndex(int index){
        Node cur = this.head;
        int count = 0;
        for(int i = 0;i < index;i++){
            cur = cur.next;
            count++;
        }
        return cur;
    }

    public boolean addIndex(int index, int data) {
        Node cur = searchIndex(index);
        if(index == 0){
            addFirst(data);
            return true;
        }if(index == getLength()){
            addLast(data);
            return true;
        }
        else{
            Node node = new Node(data);
            cur.prev.next = node;
            node.next = cur;
            node.prev = cur.prev;
            cur.prev = node;
        }
        return true;
    }

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

    public int remove(int key) {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            if (cur.data == key) {
                count = key;
            if (cur == this.head) {
                this.head = this.head.next;
                this.head.prev = null;
            } else {
                cur.prev.next = cur.next;
                if (cur.next != null) {
                    cur.next.prev = cur.prev;
                }else{
                    this.last = cur.prev;
                }
            }
            return count;
            }
            cur = cur.next;
        }
     return -1;
    }
//        while(cur.data == key){
//            cur = cur.next;
//            count++;
//        }
//        if(cur.data == this.head.data){
//            this.head = this.head.next;
//            this.head.prev = null;
//            return count;
//        }else if(cur.data == this.last.data){
//            cur.prev.next = null;
//            this.last = cur.prev;
//            return getLength()-1;
//        }else {
//            cur.prev.next = cur.next;
//            cur.next.prev = cur.prev;
//            return count;
//        }


    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else{
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }

    public void display() {
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        while(this.head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
    }
}
