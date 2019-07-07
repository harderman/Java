package com.bittech.hello;
import java.util.Scanner;
// class No_k_Big{
//    private int data;
//    int result = 0;
//    public void m(){
//        result += 2;
//        data += 2;
//        System.out.print(result+" "+data);
//     }
//}
//class TreadExplame extends Thread{
//     private No_k_Big mv;
//     public TreadExplame(No_k_Big mv){
//         this.mv = mv;
//     }
//
//    public void run(){
//         synchronized (mv){
//             mv.m();
//         }
//    }
//}
//enum aa{
//     a,b,c;
//     private aa(){
//         System.out.println("it is a A");
//    }
//
//}
//        System.out.println("hello");
//        System.out.println(i);
//        System.out.println( Math.round(11.5));
//        System.out.println( Math.round(-11.5));
//        System.out.println(aa.a);
//        No_k_Big mv = new No_k_Big();
//        Thread t1 = new TreadExplame(mv);
//        Thread t2 = new TreadExplame(mv);
//        Thread t3 = new TreadExplame(mv);
//        t1.start();
//        t2.start();
//        t3.start();
// System.out.println(" qin shu ru nian ling");
//        if (scanner.hasNext()) { // 有输入内容,不判断空字符串
//             System.out.println("输入内容为: "+scanner.next());
//             }
//             scanner.close() ;
class Palindrome {
    public static boolean isHuiwen(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
public class helloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        int count = 0;
        for(int i = 0;i <= A.length();i++){
            StringBuilder stringBuffer = new StringBuilder(A);
            stringBuffer.insert(i,B);
            if(Palindrome.isHuiwen(stringBuffer.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
