import java.util.Scanner;
class MyThread2 implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        while(this.ticket>0){
            System.out.println("票数是"+this.ticket--);
        }
    }
}
public class Main1{
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2).start();
        new Thread(myThread2).start();
    }
}



                