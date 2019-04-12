

public class git_text {
    public static void main(String[] args){
        for (color temp:color.values()){
            System.out.println(temp.ordinal() +" "+temp.name());
        }
    }
}
enum color{
    red,blue,green;
}
