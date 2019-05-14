public class TestDemo1 {
    public static void main(String[] args) {
        xxx XXX = new xxx(null);

        XXX.addFirst(10);
        XXX.addFirst(20);
        XXX.addFirst(30);
        XXX.addFirst(40);
        XXX.addFirst(50);
        XXX.addFirst(50);
        //XXX.display();
        XXX.addLast(60);
        XXX.display();
        XXX.addIndex(1,15);
        XXX.display();
        XXX.remove(1);
        XXX.display();
        XXX.removeAllKey(50);
        XXX.display();
        System.out.println(XXX.getLength());
        System.out.println(XXX.contains(60));
    }
}
