package DayQuestion;

import java.util.Scanner;
//0~n中2出现的次数

public class Num_two {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        System.out.println(countNumberOf2s(n));
    }
    private static int countNumberOf2s(int n) {
        int low = 0;//低位
        int high = 0;//高位
        int count = 0;//当前位
        int result = 0;
        int factor = 1;
        if(n<10&&n>=2){
            return 1;
        }
        if(n<2){
            return 0;
        }
        /*假设输入为123
        第一次循环low为0
        high为12
        conut为3
        此时计算的是个位上的2的个数
        第二次循环计算的是十位上的
        依次知道最高位，再将各位的2的个数累加即为所求
        */
        while(n/factor!=0){
            low = n-(n/factor)*factor;
            count = (n/factor)%10;
            high = n/(factor*10);
            if(count<2){
                result += high*factor;//比2小时
            }
            if(count == 2){
                result += high*factor+low+1;//当前位为2时
            }
            if(count>2){
                result += (high+1)*factor;//比2大时
            }
            factor *= 10;
        }

        return result;
    }
}