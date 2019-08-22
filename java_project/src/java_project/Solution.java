//青蛙跳台阶，一次 1或2
public class Solution {
    public int JumpFloor(int target) {
        if(target <= 2){
            return target;
        }
            int dp1 = 1;
            int dp2 = 2;
        for(int i = 3;i <= target;i++){
            int temp = dp1 + dp2;
            dp1 = dp2;
            dp2 = temp;
        }
        return dp2;
    }
}