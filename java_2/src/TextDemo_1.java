import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface ISubject{
    void eat();
}
class RealSubject implements ISubject{
    @Override
    public void eat() {
        System.out.println("吃饭!");
    }
}

class ProxySubject implements ISubject{
    private ISubject iSubject;
    public ProxySubject(ISubject iSubject){
        this.iSubject = iSubject;
    }
    private void prepare(){
        System.out.println("饭前准备");
    }
    private void AfterEat(){
        System.out.println("饭后收拾家务");
    }
    @Override
    public void eat() {
        this.prepare();
        iSubject.eat();
        this.AfterEat();
    }
}

class Factory{
    private Factory(){}
    public static Object getInstance(String classname){
        try {
            Class cls  =  Class.forName(classname);
            return cls.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Object getInstance(String classname,Object object){
        try {
            Class cls = Class.forName(classname);
            Constructor constructor= cls.getConstructor(cls.getInterfaces()[0]);
           return constructor.newInstance(object);
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
public class TextDemo_1 {

    public static void main(String[] args) {
    ISubject iSubject = (ISubject) Factory.getInstance("RealSubject");
        ISubject iSubject1 = (ISubject) Factory.getInstance("ProxySubject",iSubject);
        iSubject1.eat();
    }
}
