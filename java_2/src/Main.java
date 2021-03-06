import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person.class ;
        Method[] methods = cls.getMethods() ;
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}


class Person1 {
    private String name ;
    private int age ;
    public Person1() {}
    public Person1(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
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
