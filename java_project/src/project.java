 class Humen
{
    private String name;
    private int age;
    public Humen(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "姓名："+this.name+",年龄："+this.age ;
    }
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false ;
        }
        if(this == obj)
        {
            return true ;
        }        // 不是Person类对象
        if (!(obj instanceof Humen))
        {
            return false ;
        }
        Humen humen = (Humen) obj ; // 向下转型，比较属性值
        return this.name.equals(humen.name) && this.age==humen.age ;
    }
}

public class project
{
    public static void main(String[] args)
    {
        Humen humen1 = new Humen("张军",22);
        Humen humen2 = new Humen("张军",22);
        System.out.println(humen1.equals(humen2));
    }
}
