package java_project;
class lazyMan{
    private static  lazyMan LAZY_MAN;
    private lazyMan(){}
    static lazyMan getInstance(){
        if(LAZY_MAN == null){
            LAZY_MAN = new lazyMan();
        }
        return LAZY_MAN;
    }
    public void print(){
        System.out.println("hello lazyMan");
    }
}

public class test_lazyMan {
    public static void main(String[] args) {
        lazyMan LAZY_MAN = null;
        LAZY_MAN = lazyMan.getInstance();
        LAZY_MAN.print();
    }
}
