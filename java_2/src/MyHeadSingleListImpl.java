/**
 * 带头节点的循环单链表
 */
public class MyHeadSingleListImpl implements ICLinked {
    class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    //头结点
    public Node() {
        this.data = -1;
        this.next = null;
    }
}
    private Node head;
    public MyHeadSingleListImpl() {
        this.head = new Node();
        this.head.next = this.head;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
//        this.head.next = node;
//        node.next = this.head.next;
        node.next = this.head.next;
        this.head.next = node;
    }

    @Override
    public void addLast(int data) {

        Node cur = this.head;
        while(cur.next != this.head ){
            cur = cur.next;
        }
        Node node = new Node(data);

        node.next = this.head;
        cur.next = node;
    }
//检验index是否合法
    private void checkIndex(int index) {
        if(index < 0 || index > getLength()){
            throw new UnsupportedOperationException("index位置不合法");
        }
    }

    @Override
    public boolean addIndex(int index, int data) {
        checkIndex(index);
        Node node = new Node(data);
        Node cur  = this.head;
        //循环走出时。cur即为index的前驱
        for(int i = 0;i <index;i++){
            cur = cur.next;
        }
       node.next = cur.next;
        cur.next = node;
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head.next;
        while(cur != this.head){
            if(cur.data == key)
                return true;
            cur = cur.next;
        }
        return false;
    }
//找前驱
    private Node searchPrev(int key){
        Node cur = this.head;
        while (cur.next != this.head){
            if(cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
//删除链表中的第一个key
    @Override
    public int remove(int key) {
         Node  prev =searchPrev(key);
         if(prev == null){
             throw new UnsupportedOperationException("没有key前驱");
         }
         int Delete = 0;
        Node del = prev.next;
         Delete = del.data;
         prev.next = del.next;
         return Delete;
//    Node prev = searchPrev(key);
//    if(prev == null){
//        throw new UnsupportedOperationException("没有key的前驱");
//    }
//
    }
//删除链表中的所有key
    @Override
    public void removeAllKey(int Key){
            if(this.head == null||this.head.next == this.head) {
                return ;
            }
            Node prev = this.head;
            Node cur = this.head.next;
            while (cur != this.head) {
                if(cur.data == Key){
                    prev.next = cur.next;
                    cur = prev.next;
                }else {
                    prev = cur;
                    cur = cur.next;
                }
            }
        }

    @Override
    public int getLength() {
        int length = 0;
        Node cur = this.head;
        while(cur.next != head){
            cur = cur.next;
            length++;
        }
        return length;
    }
//输出当前链表
    @Override
    public void display() {
        Node cur = this.head.next;
        while (cur != this.head){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
            System.out.println();
    }

    @Override
    /**
     * jps
     *
     */
    public void clear() {


    }

    public static void main(String[] args) {
        MyHeadSingleListImpl m = new MyHeadSingleListImpl();
        m.addLast(13);
        m.addFirst(11);
        m.addFirst(12);
        m.addFirst(114);
        m.display();
    }
}
