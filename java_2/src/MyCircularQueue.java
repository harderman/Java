package com.bittech.hello;

public class MyCircularQueue {
    private int front;
    private int rear;
    private int useSide;
    private int[] elem;//数组


    /** Initialize your data structure here.
     * Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.front = 0;
        this.rear = 0;
        this.useSide = 0;
        this.elem = new int[k+1];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }else {
            this.elem[this.rear] = value;
            this.rear =(this.rear+1)%this.elem.length;
            this.useSide++;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");
        }
        else{
            this.elem[rear] = 0;
            this.front = (this.front+1)%this.elem.length;
            this.useSide--;
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");
        }
        return this.elem[this.front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            throw new UnsupportedOperationException("队列为空");
        }
        int index = this.rear == 0?this.elem.length-1:this.rear-1;
        return index;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {

        return this.rear == this.front;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((this.rear + 1)%this.elem.length == this.front){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */


