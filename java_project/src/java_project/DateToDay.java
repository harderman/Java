package DayQuestion;

import java.util.Scanner;
//输入年月日，将其转换为今年的第几天
public class DateToDay {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int year = sca.nextInt();
            int month = sca.nextInt();
            int day = sca.nextInt();
            System.out.println(iConverDateToDay(year,month,day));
        }
    }
    public static int iConverDateToDay(int year,int month,int day){
        int result = 0;
        if(month<1||month>12||day<=0||day>31){
            return -1;
        }else if((!IsLeapYear(year)&&month == 2&&day>28)||
                (IsLeapYear(year)&&month == 2&&day>29)||
                (!IsBigMonth(month)&&day>30)){
            return -1;
        }
        for(int i = 1;i<month;i++){
            if(IsBigMonth(i)){
                result += 31;
            }else{
                if(IsLeapYear(year)&&i == 2){
                    result += 29;
                }else if(!IsLeapYear(year)&&i == 2){
                    result += 28;
                }else{
                    result += 30;
                }

            }
        }
        result += day;
        return result;
    }
    public static boolean IsLeapYear(int year){
        if(year%400 == 0){
            return true;
        }else return year % 4 == 0 && year % 100 != 0;
    }
    public static boolean IsBigMonth(int month){
        return month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12;
    }
}
