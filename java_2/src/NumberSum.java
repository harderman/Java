package com.bittech.hello;


import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int N = n*n;
        System.out.print(Sum(n) + " " + Sum(N));
    }
        public static int Sum(int n){
            int resoult = 0;
            while (n % 10 != 0|| n/10 != 0) {
                resoult += n % 10;
                n = n / 10;
            }
            return resoult;
        }
    }
