
class Message<T>{
    private T massage;

    public void setMassage(T massage) {
        this.massage = massage;
    }

    public T getMassage() {
        return massage;
    }
}
public class project_0411{
    public static void main(String[] args) {
        Message<Integer> message = new Message();
        message.setMassage(55);
        fun(message);
    }
    public static void fun(Message<?> temp){
        //temp.setMassage(100);不能修改
        System.out.println(temp.getMassage());
    }

}