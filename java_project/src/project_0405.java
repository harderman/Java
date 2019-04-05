/*
1).Person类有name,age,salary属性，要求实现至少两个构造方法，并且属性私有，提供对应的getter、setter。
2).覆写toString方法，要求在System.out.println()函数中传递Person对象能打印出三个属性值而不是对象地址。
3).覆写equals方法，要求两个Person类对象的值相同时返回true。
*/
class Person1
{
    private  String name;
    private int age;
    private double salary;
    public  Person1(String name,int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public  Person1()
    {
        System.out.println("员工信息");
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }



    @Override
    public String toString()
    {
        return "名字："+this.name +" 年龄："+this.age+"工资："+this.salary;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(!(obj instanceof Person1))
            return false;
        Person1 person = (Person1) obj ; // 向下转型，比较属性值
        return this.name.equals(person.name) && this.age==person.age &&this.salary == person.salary;
    }
}


public class project_0405
{
    public static void main(String[] args)
    {
        Person1 per =  new Person1("张三",22,10000);
        Person1 per1 =  new Person1("张三",22,10000);
        System.out.println(per);
        System.out.println(per.equals(per1));
    }
}
