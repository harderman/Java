import java.util.Scanner;

public class BackMoney {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String a= sca.nextLine();
        String[] price = a.split(" ");
        String[] result1 ;
        String[] result2 ;
        result1 = price[0].split("\\.");
        result2 = price[1].split("\\.");
        int money[] = new int[6];
        for(int i = 0;i<result1.length;i++){
            money[i] = Integer.parseInt(result1[i]);
            money[i+3] = Integer.parseInt(result2[i]);

        }
        int pay = (money[3]*17+money[4])*29+money[5];
        int shouldPay = (money[0]*17+money[1])*29+money[2];
        int ReTurn = pay - shouldPay;
        if(ReTurn<0){
            System.out.println(-ReTurn/29/17+"."+(-ReTurn/29%17)+"."+(-ReTurn%29));
        }
        System.out.println(ReTurn/29/17+"."+ReTurn/29%17+"."+ReTurn%29);
    }
}
