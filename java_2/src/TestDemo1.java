public class TestDemo1 {
    public static void main(String[] args) {
        MySingleListImpl mySequence = new MySingleListImpl(null);
        mySequence.addFirst(10);
        mySequence.addFirst(20);
        mySequence.addFirst(30);
        mySequence.addFirst(40);
        mySequence.addFirst(50);
        mySequence.addFirst(50);
        //mySequence.display();
        mySequence.addLast(60);
        mySequence.display();
        mySequence.addIndex(1,15);
        mySequence.display();
//        XXX.remove(10);
//        XXX.display();
//        XXX.removeAllKey(50);
//        XXX.display();
//        System.out.println(XXX.getLength());
//        System.out.println(XXX.contains(60));
////        System.out.println(XXX.hasCycle());
////        XXX.createLoop();
////        System.out.println(XXX.hasCycle());
//        XXX.reverseList();
//       xxx.Node node = XXX.detectCycle();
//        System.out.println(node);
//        MySingleListImpl.Node m = new MySingleListImpl(null).new Node(-1);
        public MySingleListImpl.Node mergeTwoLists(MySingleListImpl.Node headA, MySingleListImpl.Node headB) {
            MySingleListImpl mySingleList1 = new MySingleListImpl(null);
            MySingleListImpl.Node newHead =
                    mySingleList1.new Node(-1);//虚拟节点

            MySingleListImpl.Node tmpHead = newHead;

            while(headA != null &&  headB != null) {
                if() {
                }
                }
            }


            return newHead.next;
        }

    }
