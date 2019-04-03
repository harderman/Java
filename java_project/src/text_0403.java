class person
{
    private String name;
    private int age;
    public person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class text_0403
{
    public static void main(String[] args)
    {
        fun(new person("zhangsan",33));
        fun("hello");

    }
    public static void fun(Object obj)
    {
        System.out.println(obj.toString());
    }

}
