/**
 * 取得全部普通方法:
 *public Method[] getMethods() throws SecurityException
 * 取得指定普通方法:
 *public Method getMethod(String name, Class<?>... parameterTypes)
 * 以上两个方法范辉的类型是java.lang.reﬂect.Method类的对象，在此类中提供有一个调用方法的支持:
 * 调用:
 *public Object invoke(Object obj, Object... args)throws
 * IllegalAccessException, IllegalArgumentException,InvocationTargetException
 */

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "name is:"+this.name+" "+"age is:"+this.age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class means_text {
    public static void main(String[] args) throws Exception {
        Class<?> classes = Person.class;// 任何时候调用类中的普通方法都必须有实例化对象
        Method[] GetMethods = classes.getMethods();
        for (Method clr:GetMethods) {
            System.out.println(clr);
        }
        System.out.println("-------------+-------------------+------");
        Object object = classes.newInstance(); // 取得setName这个方法的实例化对象,设置方法名称与参数类型
        // 随后需要通过Method类对象调用指定的方法，调用方法需要有实例化对象
        // 同时传入参数
        Method method = classes.getMethod("setName", String.class);
        method.invoke(object,"Regina Spektor");// 相当于Person对象.setName("Regina Spektor") ;
        Method method1 = classes.getMethod("getName");
        Object result = method1.invoke(object);//相当于Person对象.getName()
        System.out.println("My favourite singer is "+result);
    }
}
