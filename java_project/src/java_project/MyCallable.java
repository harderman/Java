package java_project;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String > {
    private int ticket = 10;
    @Override
    public String call() throws Exception {
        while(this.ticket>0){
            System.out.println("剩余的票数是"+this.ticket--);
        }
        return "票卖完了，下次吧";
    }
}
public class MyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new MyThread());
        new Thread(futureTask).start();
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
