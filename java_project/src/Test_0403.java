
class Person
{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return " 姓名:"+this.name +" 年龄:" +this.age;
    }
}

public class Test_0403
{
    public static void main(String[] args)
    {
        String msg = " " + new Person("张三",33);
        System.out.println(msg);
        fun("hello");

    }
    public static void fun(Object obj)
    {
        System.out.println(obj.toString());
    }

}
