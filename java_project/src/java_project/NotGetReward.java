
import java.util.Scanner;
public class NotGetReward{
    //第一步，把第n个元素放在一个位置，比如位置k，一共有n-1种方法；
        // 第二步，放编号为k的元素，这时有两种情况：把它放到位置n，那么，对于剩下的n-1个元素，
        // 由于第k个元素放到了位置n，剩下n-2个元素就有D(n-2)种方法；
        // 第k个元素不把它放到位置n，这时，对于这n-1个元素，有D(n-1)种方法；
        // 综上得到递推公式，可以发现可以用递归来做；
        // D(n) = (n-1) [D(n-2) + D(n-1)]
        // 特殊地，D(1) = 0, D(2) = 1.
        // 那么D(5)=4*[D(3)+D(4)]；依次求得D(3)、D(4),最后D(5)=44
        // 所以5个人拿不到奖的概率就是44/120=36.67%
        public static float count(int n) {
               //这个函数用来得到有多少种可能，每个人拿不到自己的名字，
               // 也就是得到分子
                if(n==1){
               // n=1的时候返回0
                return 0;
                }
                if(n==2){
               // n=2的时候返回1
                return 1;
                }else{
               // 否则就递归。
                return (n-1)*(count(n-1)+count(n-2));
                }
        }
               // 下面的函数用来求阶乘，也是递归，最后得到分母
                public static float probability(int n){
                if(n==0){
              //  0的阶乘等于1，不用多说吧
                return 1;
                }else{
              //  阶乘表示，进行递归
                return n*probability(n-1);
                }
        }
                public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                do {
                int n = sc.nextInt();
               // 将得到的分子分母进行相除，就可以得到概率了。
                float result = (count(n)/probability(n))*100;
                System.out.println(String.format("%.2f", result) + "%");
                } while (sc.hasNext());
        }
}