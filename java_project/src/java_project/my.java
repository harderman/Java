import java.util.*;
public class my{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String str = sca.next();
            if(str == null){
                System.out.println(0);
            }
            int temp = 0;
            char[] a = str.toCharArray();
            for(int i = 0;i<str.length()-1;i++){
                if(!(a[i].toSring().equals(a[i+1].toString()))){
                    temp++;
                }
            }
            if(temp == 0){
                System.out.println(str.length());
            }
            System.out.println(str.length()/temp);
        }
    }
}