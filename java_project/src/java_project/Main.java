package DayQuestion;

import java.util.Scanner;
//阶乘
public class Main{
    static float count(int n){
        if(n == 1){
            return 0;
        }if(n == 2){
            return 1;
        }
        return (n-1)*(count(n-1) + count(n-2));
    }
    static float  pro(int n){
        int count = 1;
        for(int i = 1;i<=n;i++){
            count *=i;
        }
        return (float) count;
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
//        while (sca.hasNextInt()) {
//            int number = sca.nextInt();
//            float probability = (count(number)) / pro(number) * 100;
//            System.out.println(String.format("%.2f", probability) + "%");
//
//        }
        System.out.println(pro(15));
    }

}
