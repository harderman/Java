package com.bittech.hello;

public class MyStackImpl implements IMyStack {
    private int[] elem;//存放数据元素的数组
    private int top;//当前可以存放数据元素的下标
    private int usedSize;

    public MyStackImpl(int size) {
        this.elem = new int[size];
        this.top = 0;
        this.usedSize = 0;
    }

    private boolean isFull() {
        return this.top == this.elem.length;
    }

    public void push(int item) {
        if(isFull()){
            throw new UnsupportedOperationException("栈为满");
        }
        this.elem[this.top++] = item;
        this.usedSize++;
        //this.top++;
    }

    public int pop() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        this.top--;
        this.usedSize--;
        return this.elem[this.top];
    }

    public int peek() {
        if(empty()){
            throw new UnsupportedOperationException("栈空");
        }
        return this.elem[this.top-1];
    }

    public boolean empty() {
        return this.usedSize == 0;
    }

    public int size() {
        return this.usedSize;
    }

    public void add(int item) {

    }
}

//    class Node{
//        private int data;
//        private Node next;
//        public Node(int data){
//            this.data = 0;
//            this.next = null;
//        }
//    }
//    private Node front;
//    private Node rear;
//    private int usedSize;
//    public MyStackImpl(){
//        this.front = null;
//        this.rear = null;
//        this.usedSize = 0;
//    }
//
//
//    public void add(int item) {
//
//    }
//
//    public void push(int item) {
//
//
//    }
//
//    public int pop() {
//        return 0;
//    }
//
//    public int peek() {
//        if(empty()){
//            throw new UnsupportedOperationException("队列为空");
//        }
//        return this.front.data;
//    }
//
//    public boolean empty() {
//
//        return false;
//    }
//
//    public int size() {
//        return 0;
//    }
//    //
//    public int poll(){
//        if(empty()){
//            front = front.next;
//        }
//        return 0;
//    }


