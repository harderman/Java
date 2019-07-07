import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class MyThread implements Runnable{
private int i = 10;
    @Override
    public void run() {
        while(i > 0){
            System.out.println(Thread.currentThread().getName()+": "+i);
            i--;
        }
    }
}
public class statistics {
    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        int item = sca.nextInt();
//        int i = 5;
//        System.out.println((i++)+(++i)+(i--)+(--i));
//        System.out.println((i++));
//        System.out.println((++i));
//        System.out.println((i--));
//        System.out.println((--i));
//    }
//    public static void find(int item){
//        while(item == 0) {
//            int i;
//            item /= 10;
//        }

  MyThread myThread = new MyThread();
       Thread thread = new Thread(myThread);
  thread.start();
String s = "abfddx";
       System.out.println(s.substring(1,2));
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"bit");
        System.out.println(map.get(1));
        System.out.println(map.get(0));
    }
}
