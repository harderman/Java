
@FunctionalInterface
interface IUtil<P,R>{
    public R switchPara(P p) ;
}


public class text_0410 {
    public static void main(String[] args) {
    IUtil<Integer,String> iu = String::valueOf;
    String str = iu.switchPara(1000);
        System.out.println(str.length());
    }
}
