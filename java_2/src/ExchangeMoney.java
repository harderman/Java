public class ExchangeMoney {
    public static void main(String[] args) {
        System.out.print(ExchangeMoney.RichMan());
        System.out.print(ExchangeMoney.poorMan());
    }
    public static int RichMan(){
        int money = 0;
        for(int i = 0;i<30;i++){
            money = money + 10;
        }
        return money;
    }
    public static int poorMan(){
        int money = 0;
        for(int i = 0;i<30;i++){
           int DayMoney = (int)Math.pow(2,i);
            money = DayMoney + money;
        }
        return money;
    }
}
