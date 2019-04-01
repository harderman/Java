public class project_0401
{
    public static void main(String[] args)
    {
        byte[] var = new byte[]{'s','t','u','d','e','n','t'};
        StringBuffer Str = new StringBuffer("hello world");
        String  str = "kids";
        byte[] date =str.getBytes();
        String c = Str.toString();
        System.out.println(c);
        for (int i = 0; i < 7; i++)
        {

            System.out.println(var[i]);
        }
            System.out.println(new String(var));
        System.out.println(date);
    }
}
