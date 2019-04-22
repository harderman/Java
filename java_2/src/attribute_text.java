import java.lang.reflect.Field;
class Man{
    private String name;
    private int age;

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
     public void Man(String name,int age){
        this.age = age;
        this.name = name;
     }
    @Override
    public String toString() {
        return "名字是："+this.name+" "+"年龄是："+this.age;
    }
}

public class attribute_text {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException,
            IllegalAccessException, InstantiationException {
        Class<?> classes = Class.forName("Man");
       Object object = classes.newInstance();
        Field[] fields = classes.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field field = classes.getField("");
        System.out.println(field);
        System.out.println(object);
    }
}

