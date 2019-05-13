
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//动态代理
public class SubjectHander implements InvocationHandler {
    /**
     *
     */
    private Object target;

    public SubjectHander(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("用户通过代理增强业务功能 before");
        Object returnValue = method.invoke(target,args);
        System.out.println("用户通过代理增强业务功能 after");
        return returnValue;
    }

    public static void main(String[] args) {
        //业务对象，被代理对象
        ISubject subject = new RealSubject();
        //对业务对象进行拓展的逻辑
        SubjectHander hander = new SubjectHander(subject);
        //代理对象
       ISubject proxyObject = (ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),
               new Class[]{ISubject.class},hander);
        proxyObject.eat();
    }
}
