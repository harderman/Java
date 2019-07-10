import java.util.Scanner;

//统计0~n中2出现的次数
public class Times {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int number = n;
        int count = 1;
        while(n/10!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
        int times=0;
        for(int i = 1;i<=count;i++){
            for(int j = (int)Math.pow(10,i-1);j<=number;j++){
                if((j/(int)Math.pow(10,i-1))%10==2){
                    times++;
                }
            }
        }
        System.out.println(times);
    }
}
