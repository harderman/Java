public class xxx  implements ILinked{
    class Node{
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;

        }
    }

    public xxx(Node head) {
        this.head = head;
    }

    private Node head;
    @Override
//头插法
        public void addFirst(int data) {
         Node node = new Node(data);
    //如果是第一次插入
        if(this.head == null){
            this.head = node;
        }else{
     //非第一次插入
            node.next = this.head;
            this.head = node;
        }
    }
//尾插
    @Override
    public void addLast(int data) {
    Node node = new Node(data);
    Node cur = this.head;
    //第一次插入
        if(this.head == null){
            this.head = node;
        }else{
    //非第一次插入,找尾巴
          while(cur.next != null/*this.head.next != null*/){
              cur = cur.next;
            //this.head = this.head.next;
          }
          //退出循环即代表尾巴找到了，cur所指向的位置就是尾节点
            cur.next = node;
          //this.head.next = node;
        }
    }

//指定位置插入
//    @Override
//    public boolean addIndex(int index, int data) {
//        Node node = new Node(data);
//        Node Located = this.head;
//        Node Locate = this.head;
//        //index为头时
//        if(index == 0){
//            addFirst(data);
//            return true;
//        //index为尾时
//    } else if(index == getLength() - 1){
//            addLast(data);
//            return true;
//        //index非法时
//    } else if(index < 0 || index > getLength()){
//            return false;
//        //插入一般情况下的index
//    } else{
//            int location = 1;
//            Located = Located.next;
//            while(index != location){
//                Located = Located.next;
//                Locate = Locate.next;
//                location++;
//            }
//            node.next = Located;
//            Locate.next = node;
//            return true;
//        }
//       // return false;
//    }
////删除指定位置
//    @Override
//    public int remove(int key) {
//        Node cur = this.head;
//        Node Located = this.head;
//        Node Locate = this.head;
//        //key非法时
//        if(key < 0||key > getLength()){
//            return -1;
//        }
//        else if(key == 0){
//           this.head = this.head.next;
//           return 0;
//        }
//        else if(key == getLength()-1){
//            for(int i =0;i<getLength()-2;i++){
//                cur = cur.next;
//            }
//            cur.next = null;
//            return 0;
//        }
//        else{
//            int location = 1;
//            Located = Located.next;
//            Located = Located.next;
//            while(key != location) {
//                Located = Located.next;
//                Locate = Locate.next;
//                location++;
//            }
//            Locate.next = Located;
//        }
//        return 0;
//    }
////删除指定的所有内容
//    @Override
//    public void removeAllKey(int key) {
//       Node prev = this.head;
//       Node cur = this.head.next;
//       while(cur != null){
//           if(cur.data == key){
//               prev.next = cur.next;
//               cur = cur.next;
//           } else{
//               prev = cur;
//               cur = cur.next;
//           }
//       }
//    }
//找前驱
    private Node SearchIndex(int index){
        checkIndex(index);
        Node cur = this.head;
        int count = 0;
        while(count < index - 1){
            cur = cur.next;
            count++;
        }
        return cur;
    }
//找前驱
    private Node SearchPrev(int key){
        Node cur = this.head;
        while(cur.next != null){
            if(cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
//检测index是否合法
    private void checkIndex(int index){
        if(index < 0||index > getLength()){
            throw new UnsupportedOperationException("非法的index");
        }
    }

    @Override
    public boolean addIndex(int index, int data) {
        checkIndex(index);
        if(index == 0){
            addFirst(data);
            return true;
        }
        Node node = new Node(data);
        Node before = SearchIndex(index);
        node.next = before.next;
        before.next = node;
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (key == cur.data) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    @Override
    public int remove(int key) {
//单链表为空
        if(this.head == null ){
            throw new UnsupportedOperationException("单链表为空");
        }
//key在头节点
        if(this.head.data == key ){
            this.head = this.head.next;
            return key;
        }
        if( SearchPrev(key) == null){
            throw new UnsupportedOperationException("没有前驱");
        }
        Node Prev = SearchPrev(key);
        Node delete = Prev.next;
        Prev.next = delete.next;
        return delete.data;
    }

    @Override
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if(cur.data == key){
                prev.next = cur.next;
                cur = prev.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key){
            this.head = this.head.next;
        }
    }

    //获取列表的长度
    @Override
    public int getLength() {
        Node cur = this.head;
        int length = 0;
        while(cur != null){
            cur = cur.next;
            length++;
        }
        //System.out.println(length);
        return length;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur!= null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
    while(this.head.next != null){
        Node del = this.head.next;
        this.head.next = del.next;
    }
    this.head = null;
    }
}
