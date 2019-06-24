class MyThread extends Thread{
    private String title;
    public MyThread(String title){
        this.title = title;
    }
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println(this.title+", i=" + i);
        }
    }
}
public class TextThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("thread");
        MyThread myThread1 = new MyThread("thread1");
        MyThread myThread2 = new MyThread("thread2");
        myThread.run();
        myThread1.run();
        myThread2.run();
    }

}
