package java_project;
class Longest
{
    public void find(char str[])
    {
        int[] num = new int[str.length];
        int index = 0;
        num[index] = 1;
        System.out.println(num[index]);
        for (int i = 0; i <str.length; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if (str[i] != str[j])
                {
                    num[index] += 1;
                } else if (str[i] == str[j])
                {
                    index ++;
                    num[index] = 0;
                    break;
                }
            }
        }
        java.util.Arrays.sort(num) ;
        System.out.println(num[num.length-1]);
    }
}
public  class Longest_string {
    public static void main(String[] args) {
        char[] str = new char[]{'a','b','c','a','b','c','a','b',};
        Longest longest = new Longest();
        longest.find(str);
    }
}
