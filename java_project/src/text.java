

public class text
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.append("hello").append(" ").append("world"));
        //String变为StringBuﬀer:利用StringBuﬀer的构造方法或append()方法
        // StringBuﬀer变为String:调用toString()方法。
    }
}
