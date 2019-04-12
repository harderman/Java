package java_project;
//？extends 类 设置上限
//？super 类 设置下限
class Message<T extends Number >{//设置上限
    private T massage;

    public void setMassage(T massage) {
        this.massage = massage;
    }

    public T getMassage() {
        return massage;
    }
}
public class project_PM{
    public static void main(String[] args) {
        Message<Integer> message = new Message();
        Letter<String > letter = new Letter<>();
        letter.setLetter("hello world");
        message.setMassage(55);
        fun(message);
        fan(letter);
    }
    public static void fun(Message<? extends Number> temp){
        //temp.setMassage(100);此时仍不能修改
        System.out.println(temp.getMassage());
    }
    public static void fan(Letter<? super String> temp){//设置下限
        temp.setLetter("success");//可以修改！
        System.out.println(temp.getLetter());
    }
}

class Letter<T>{
    private T letter;

    public T getLetter() {
        return letter;
    }

    public void setLetter(T letter) {
        this.letter = letter;
    }
}