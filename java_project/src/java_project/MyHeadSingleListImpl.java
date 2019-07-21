package DS;
//带头循环单链表
import Interface.ICLinked;

public class MyHeadSingleListImpl implements ICLinked {
    class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
            this.data = -1;
            this.next = null;
        }
    }

    private Node head;
    private MyHeadSingleListImpl() {
        this.head = new Node();
        this.head.next = this.head;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        //以下两句顺序很重要
        node.next = this.head.next;
        this.head.next = node;
    }

    @Override
    public void addLast(int data) {
        Node cur = this.head;
        while (cur.next != this.head) {
            cur = cur.next;
        }
        Node node = new Node(data);
         node.next = this.head;
        cur.next = node;
    }

    @Override
    public boolean addindex(int index, int data) {
        if (index < 0 || index > getLength()) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        } else if (index == getLength()) {
            addLast(data);
            return true;
        }
        //找下标,跳出循环时cur就是index下标
        Node cur = this.head.next;
        int count = 1;
        while (count != index) {
            count++;
            cur = cur.next;
        }
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    @Override

    public boolean contains(int key) {
        Node cur = this.head;
        while (cur.next != this.head) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        if (cur.data == key) {
            return true;
        }
        return false;
    }

    public Node SearchPrev(int key) {
        Node cur = this.head;
        //找前驱
        while (cur.next != this.head) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public int remove(int key) {
        if(this.head == null ){
            throw new UnsupportedOperationException("单链表为空");
        }
        Node prev = SearchPrev(key);
        if (prev == null) {
            throw new UnsupportedOperationException("没有前驱！");
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return key;
        }
        Node delete = prev.next;
        prev.next = delete.next;
        return delete.data;
    }

    @Override
    public void removeAllKey(int key) {
        if (this.head == null || this.head.next == this.head) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != this.head) {
            if (cur.data == key) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
    }

    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while (cur.next != this.head) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public void display() {
        Node cur = this.head.next;
        while (cur != this.head) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        MyHeadSingleListImpl m = new MyHeadSingleListImpl();
        m.addLast(13);
        m.addFirst(11);
        m.addFirst(12);
        m.addFirst(114);
        m.addFirst(15);
        m.display();
        m.addindex(1,15);
        m.display();
        m.remove(11);
        m.display();
        m.removeAllKey(15);
        m.display();
        System.out.println(m.getLength()+" "+m.contains(12));
    }
}