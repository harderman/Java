package DayQuestion;

import java.util.Scanner;
//动态规划，找一个数组里何为sum的组合有多少种
public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] value = new int[n];
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for(int i = 0;i<n;i++){
            value[i] = scanner.nextInt();
            for(int j = sum;j>=0;j--) {
                if (j >= value[i]) {
                    dp[j] += dp[j - value[i]];
                }
            }
        }
       System.out.println(dp[sum]);
    }
}

//最大连续子序列的最大和

/*
F（i）状态：以第i项结尾的连续子序列的最大和
F(i) = max(F(i-1)+a(i),a(i))
最后返回所有F（i）里的最大值
 */


/*
给定一个字符串S和一个词典dict，确定在词典里是否可以找到单词拼成S；
状态F(i)：前I个字符能否被分割
初始状态F(0) = true;
F(i) = s[i] + s[1]~s[i-1]

 */

/*
从一个M*N的表格左上角到右下角的走法，每次只能向右或向下
要考虑边界
状态F(i,j) = F(i-1,j)+F(i,j-1)
初始为F(0,0);

 */













