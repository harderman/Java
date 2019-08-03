package DayQuestion;

import java.util.Scanner;

/*
求最小公倍数
 */
public class least {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int i;
        for( i= 1;i<=b;i++){
            if((a*i)%b == 0){
                break;
            }
        }
        System.out.println(a*i);
    }
}
