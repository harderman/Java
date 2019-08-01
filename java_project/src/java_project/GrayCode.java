package DayQuestion;

public class GrayCode {
    public static void main(String[] args) {
        String text[] = myCode(3);
        for (int i=0;i<8;i++) {
            System.out.println(text[i]);
        }
    }
    public static String[] myCode(int n){
        String code[] = new String[(int)Math.pow(2,n)];
        if(n == 1){
            code[0] = "0";
            code[1] = "1";
            return code;

        }else{
           String newCode[] = myCode(n-1);
            for(int i=0;i<newCode.length;i++){
                code[i] ="0" + newCode[i] ;
                code[code.length-i-1] = "1" + newCode[i];
            }
        } return code;
    }
}
