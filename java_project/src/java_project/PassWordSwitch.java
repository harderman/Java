package DayQuestion;

import java.util.Scanner;

class Switch{
    //加密
    public void Encrypt(char[] aucPassword,char[] aucResult){
        for(int i = 0;i<aucPassword.length;i++){
            if(aucPassword[i]<=57&&aucPassword[i]>=48){
                if(aucPassword[i]=='9'){
                    aucPassword[i] = '0';
                }else {
                    aucPassword[i] += 1;
                }
            }
            if(aucPassword[i]<=90&&aucPassword[i]>=65) {
                if(aucPassword[i] == 'Z'){
                    aucPassword[i] = 'a';
                }else {
                    aucPassword[i] += 33;
                }
            }//97-122 小写
            if(aucPassword[i]<=122&&aucPassword[i]>=97) {
                if(aucPassword[i] == 'z'){
                    aucPassword[i] = 'A';
                }else{
                    aucPassword[i] -= 31;
                }
            }
            System.out.print(aucPassword[i]);
        }
        System.out.println();
    }

    //解密
    public void UnEncrypt(char[] result, char[] Password){
        for(int i = 0;i<result.length;i++){
            if(result[i]<=57&&result[i]>=48){
                if(result[i]=='0'){
                    result[i] = '9';
                }else
                result[i] -= 1;
            }
            if(result[i]<=122&&result[i]>=97) {
                if(result[i] == 'a'){
                    result[i] = 'Z';
                }else
                result[i] -= 33;
            }//97-122 小写
            if(result[i]<=90&&result[i]>=65) {
                if(result[i] == 'A'){
                    result[i] = 'z';
                }else
                result[i] += 31;
            }
            System.out.print(result[i]);
        }
        System.out.println();
    }
}

public class PassWordSwitch {
    public static void main(String[] args) {
        Switch sw = new Switch();
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()){
            String encrypt = sca.next();
            String unEncrypt = sca.next();
            char[] aucPassword = encrypt.toCharArray();
            char[] result = unEncrypt.toCharArray();
            sw.Encrypt(aucPassword,result);
            sw.UnEncrypt(result,aucPassword);
        }
    }
}
