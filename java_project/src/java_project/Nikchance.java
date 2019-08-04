package DayQuestion;

import java.util.Scanner;

public class Nikchance {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        int result = num*(num-1)+1;
        String str = String.valueOf(result);
        System.out.print(str);
        for(int i = 1;i<num;i++){
            result += 2;
            System.out.print("+"+String.valueOf(result));
        }
    }
}
