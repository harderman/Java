package DayQuestion;

public class reverseNode {
    class Node {
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    reverseNode(Node head){
        this.head = head;
    }
    public Node reverseList(Node head){
        if(head == null||head.next == null){
            return head;
        }
        Node p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    /*
递归
       if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;



迭代
ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }
    return prev;
}

     */
}
