package DayQuestion;

//输入俩个整数n，m，从数列1~n中取出和等于m的所有组合
//n*(a1+an)/2
import java.util.Scanner;

public class And {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            int m = sca.nextInt();
            int[] sum = new int[n];
            for(int i = 0;i<n;i++){
                sum[i] = i+1;
            }
            if(m>(n*(1+n)/2)){
                System.out.println("");
            }
          if(n > m){
                n=m;
          }
            long[] dp = new long[m + 1];
            dp[0] = 1;
            for(int i = 0;i<n;i++){
                for(int j = m;j>=0;j--) {
                    if (j >= sum[i]) {
                        dp[j] += dp[j - sum[i]];
                    }
                }
            }
            System.out.println(dp[m]);
        }
    }
}
