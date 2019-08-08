package DayQuestion;

import java.util.Scanner;
//递归解决动态规划，找一个数组里何为sum的组合有多少种
public class sumNumberRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] value = new int[n];
        int[] dp = new int[sum + 1];

    }
    static int check(int dp){
        if(dp == 0){
            return 1;
        }
return 0;
    }
}
