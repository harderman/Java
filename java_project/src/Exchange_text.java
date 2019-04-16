
import java.lang.Math;
class Change{
    public void fun(int num){
        int[] number = new int[32];
        double var ;
        int i = 0;
        double result = 0;
        for (;i <= 31;i++){
            number[i] = num%10;
            num = num/10;
            if(num==0)
                break;
        }
      for(int j = 0;j - i <= j;j++){
       var = number[i];
       var = var*Math.pow(10,j);
       result = var+result;
       i--;
        }
        System.out.println((int)result);
    }
}
public class Exchange_text {
    public static void main(String[] args) {
        Change change = new Change();
        change.fun(-1230);
    }
}
