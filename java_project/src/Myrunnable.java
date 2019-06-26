class MyThread1 implements Runnable{
    private String title;
    public  MyThread1(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(this.title+", i="+ i);
        }
    }
}
public class Myrunnable {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("thread1");
        MyThread1 myThread2 = new MyThread1("thread2");
        MyThread1 myThread3 = new MyThread1("thread3");
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}
