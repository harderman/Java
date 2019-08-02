package Others;
/*
题目如下：假设有N瓶水(当然N>0吧)
每喝一瓶后可以得到的一个空瓶子
而 每3个空瓶子又能换1瓶水，喝掉以后又得到一个空瓶子，

问题是，你总共能喝多少瓶水，最后还剩余多少个空瓶子？
 */
import java.util.Scanner;

public class drinkWater {
    public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    int n = sca.nextInt();
    Drink(n);
        System.out.println(drink(n, 0,0));
    }

   private static void Drink(int n){
        //空杯子
        int count = 0;
        //喝的瓶数
        int number = 0;
        while(true){
            n--;
            number++;
            count++;
            if(count == 3){
                count = 0;
                n += 1;
            }
            if(n==0){
                break;
            }
        }
        System.out.println("喝水的瓶数"+number+" "+"空杯数"+count);
    }
    private static int drink(int buttle, int empty, int number1) {
        if (empty < 3 && buttle == 0) {
            System.out.println("empty :"+empty);
            return number1;
        }
        if (empty == 3) {
            empty = 0;
            buttle++;

        }
        return drink(buttle-1, empty+1, number1+1);
    }

}