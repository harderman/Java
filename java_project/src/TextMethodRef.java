
@FunctionalInterface//函数式接口，可以有default定义的默认方法以及除了Object中的方法
 interface IUtil2<R>{
     R convert();
     default void fun(){
         System.out.println("It is all right!");
     }
    String toString();
}
@FunctionalInterface
interface IUtil3<T>{
    T convert1();
}
@FunctionalInterface
interface IUtil4<T,R>{
    T convert2(R r);
}
@FunctionalInterface
interface IUtil1<T,P,D>{
    T convert(P p,D d);
}
public class TextMethodRef {
    public static void main(String[] args) {
        String str = "HELLO";
        //IUtil2<String> iUtil2 = ()->
          // str.toLowerCase();
        IUtil4<String,Integer> iUtil4 = String::valueOf;//引用静态方法
        IUtil3<String> iUtil3 = "hello"::toUpperCase;//引用对象方法
        IUtil2<String> iUtil2 = str::toLowerCase;//引用普通方法
        IUtil1<persons,String,Integer> iUtil1 = persons::new;//引用构造方法
        System.out.println(iUtil2.convert());
        System.out.println(iUtil3.convert1());
        System.out.println(iUtil4.convert2(1000));
        System.out.println(iUtil1.convert("杰西卡",18));
    }
}

class persons {
    private String name;
    private int age;

    public persons(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "名字是："+this.name+" "+"年龄为："+this.age;
    }
}
/*import java.util.function.Function;
public class TextMethodRef{
    public static void main(String[] args) {
Function<Integer,String>fun = String::valueOf;
   System.out.println(fun.apply(1000));
    }
}
*/
