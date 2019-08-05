package DayQuestion;

import java.util.Scanner;
//守型数判断，及概述的平方的后几位即为概述本身
public class GuardNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()){
        int num = sca.nextInt();
        int p = num;
        int i = 1;
        while(num/10 != 0){
            i++;
            num /= 10;
        }
        int changed = p*p;
        if((changed-p)%((int)Math.pow(10,i)) == 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        }
    }
}
