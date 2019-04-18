
class Learn{
    public void means(){
        System.out.println("try to tackle any problems!");
    }
}
public class text {
    public static void main(String[] args) throws ClassNotFoundException {
        Learn learn = new Learn();
        learn.means();
        System.out.println(learn.getClass());
        System.out.println(Learn.class);
        Class<?> learn1 = Class.forName("java.util.Date");
        System.out.println(learn1.getName());
    }
}
