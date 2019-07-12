import java.util.Scanner;
//将输入的字符进行奇校验
public class VerifyNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String str = sca.next();
            char[] number = str.toCharArray();
           // System.out.println(number[0]-'/0');
            int[] sum = new int[8];
            for(int i = 0;i<number.length;i++){
                int check = 0;
                int n = 0x01;
                int num = (int)number[i];
                for(int j = 7;j>0;j--){
                    sum[j] = (num&(n)) == 0?0:1;
                    if(sum[j] == 1){
                        check++;
                    }
                    n = n<<1;
                }
                if(check%2==0){
                    sum[0] = 1;
                }else{
                    sum[0] = 0;
                }
                for(int k = 0;k<sum.length;k++){
                    System.out.print(sum[k]);
                }
                System.out.println();
            }
        }
    }
}