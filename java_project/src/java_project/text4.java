package Others;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String str = sca.next();
            int check = 0;
            for(int a = 0;a<str.length();a++){
                int i = 0;
                for(int j = str.length()-a;j<=str.length();j++){
                    String s = str.substring(i,j);
                    i++;
                     check = check(s);
                    if(check != -1){
                        System.out.println(s);
                        break;
                    }
                }
                if(check != -1){
                    break;
                }
            }
        }
    }

    private static int check(String s) {
        char[] str = s.toCharArray();
        for(int i = 0;i<s.length();i++){
        if(str[i]<'0'||str[i]>'9'){
            return -1;
            }
        }
        return s.length();
    }
}
