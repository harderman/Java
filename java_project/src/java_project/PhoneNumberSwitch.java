package DayQuestion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PhoneNumberSwitch {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            Set<String> set = new TreeSet<>();
            for(int i = 0;i<n;i++){
                String phoneNumber = sca.next();
                char[] a = phoneNumber.toCharArray();
                if(check(phoneNumber ,a)){
                    Switch(a,set);
                }
            }
            for (String s:set) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
    public static boolean check(String number,char[] a){
        if(!(number.startsWith("-",3)&&number.split("-").length==2
                &&number.length()==8)){
            return false;
        }
        for (char anA : a) {
            char m = Switch1(anA);
            if (!((m >= '0' && m <= '9') || m == '-')) {
                return false;
            }
        }
        return true;
    }
    public static void Switch(char[] a,Set<String> set){
        StringBuffer sb = new StringBuffer();
        for (char anA : a) {
            sb.append(Switch1(anA));
        }
        set.add(sb.toString());
    }
    public static char  Switch1 (char a){
        if(a == 'A'||a =='B'||a == 'C'){
            return '2';
        }else if(a == 'D'||a =='E'||a == 'F')
            return '3';
        else if(a == 'G'||a == 'H'||a == 'I')
            return '4';
        else if(a == 'J'||a == 'K'||a == 'L')
            return '5';
        else if(a == 'M'||a == 'N'||a == 'O')
            return '6';
        else if(a == 'P'||a == 'Q'|| a == 'R'||a == 'S')
            return '7';
        else if(a == 'T'||a == 'U'|| a == 'V')
            return '8';
        else if(a == 'W' || a == 'X' ||a == 'Y'|| a == 'Z')
            return '9';
        else
            return a;
    }
}
