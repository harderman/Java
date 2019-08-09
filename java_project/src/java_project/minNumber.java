package DayQuestion;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] array = new int[10];
        int len = 0;
        for(int i=0;i<10;i++)
        {
            array[i]=sca.nextInt();
            len = array[i]+len;
        }
        int[] min = new int[len];
        for(int i = 1;i<10;i++){
           if(array[i] !=0){
               min[0] = i;
               array[i]--;
               break;
           }
       }
        int index = 1;int j = 0;
            if(array[0] != 0){
                for(;j<array[0];j++){
                    min[j+1] = 0;
                }
            }
            for(;index<10;index++){
                while(array[index] != 0){
                    min[j+1] = index;
                    j++;
                    array[index]--;
                }
            }

        for (int i = 0;i <min.length;i++){
            System.out.print(min[i]);
        }
//        Scanner in=new Scanner(System.in);
//        int num[]=new int[10];
//        //0 - 9 //输入 0 - 9 这10个数字的出现的个数
//        for(int i=0;i<10;i++){
//            num[i]=in.nextInt ();
//        }
//        // 先输出安装1-9的顺序第一个出现的数字1次
//        for(int i=1;i<10;i++){
//         if(num[i]!=0){
//         System.out.print(i);
//         num[i]--;
//         break;
//         }
//        }
//        // 第二位：输出0
//         while(num[0]!=0){
//         System.out.print(0); num[0]--; }
//        // 最后按照1-9的顺序输出
//        for(int i=1;i<10;i++)
//         { while(num[i]!=0){ System.out.print(i); num[i]--; } }

    }
}
