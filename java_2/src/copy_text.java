import java.lang.reflect.Field;
import java.util.Date;

class BeanCopy{
    public static void copy(Object source,Object target){
        //获取Class对象
        Class sourceClass = source.getClass();
        Class targetClass = target.getClass();
        //获取属性对象
        Field[] sourceFields = sourceClass.getDeclaredFields();
        Field[] targetFields = targetClass.getDeclaredFields();
        //属性赋值
        for (Field s:sourceFields) {
            for (Field t:targetFields) {
                //值，类型都要相等
             if(s.getName().equals(t.getName())&&s.getType().equals(t.getType())){
                 //赋值
                 try {
                     s.setAccessible(true);
                     Object value = s.get(source);
                     t.setAccessible(true);
                     t.set(target,value);
                 } catch (IllegalAccessException e) {
                     e.printStackTrace();
                 }
                 break;
             }
            }
        }
    }
}
class Persons{
    private String name;
    private String skill;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
class Child{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class copy_text {
    public static void main(String[] args) {
    Persons persons = new Persons();
    Child child = new Child();
    persons.setName("Jack");
    persons.setAge(33);
    persons.setSkill("Java");
    persons.setBirthday(new Date());
    child.setName("lucy");
    child.setAge(8);
        System.out.println(" Persons的属性："+persons);
        System.out.println("Child的属性："+child);
        BeanCopy.copy(persons,child);
        System.out.println("拷贝后的Child的属性："+child);
    }
}
