package DayQuestion;

class x{
    y Y = new y();
    public x(){
        System.out.println("X");
    }
}
class y{
    public y(){
        System.out.println("Y");
    }
}

public class MyCard  extends x{
    y Y = new y();
    public MyCard(){
        System.out.println("Z");
    }
    public static void main(String[] args) {
        new MyCard();
    }
}
