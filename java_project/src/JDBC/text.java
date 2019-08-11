import java.util.*;
public class text{
    public static void main( String[] args){
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String Waiter = sca.next();
            String Hong = sca.next();
            int num = 1;
            int len = Waiter.length();
            if(Waiter == null){
                System.out.println("No"+" "+ Hong.length());
            }
            for(int j = 0;j<Hong.length();j++){
                int i = Waiter.indexOf(Hong.substring(j,j+1));
                if(i != -1){
                   Waiter = Waiter.replaceFirst(Waiter.substring(i,i+1),"");
                    num += 1;
                }
            }
            if(Waiter.length()+Hong.length() == len){
                System.out.println("Yes"+" "+num);
            }else{
                System.out.println("No"+" "+
                        String.valueOf(Hong.length()-(len-Waiter.length())));
            }
        }
//        String s = "hello";
//        String a =s.replaceFirst("l","");
//        System.out.println(a);
    }
}