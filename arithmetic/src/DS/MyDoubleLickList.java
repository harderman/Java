package DS;

import Interface.IDoubleLinked;
//不带头双向不循环链表
public class MyDoubleLickList implements IDoubleLinked {
    class Node{
        private Node next;
        private int data;
        private Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public void addFirst(int data) {

    }

    @Override
    public void addLast(int data) {

    }

    @Override
    public boolean addindex(int index, int data) {
        return false;
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
