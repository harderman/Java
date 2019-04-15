package java_project;
class Person <T> {
    @Deprecated // 表示该方法已经不建议使用了，但是即便你使用了也不会出错
     public Person() {}
    public Person(String name) {}
     @Deprecated
     public void fun() {}
}
     public class Annotation_text {
     @SuppressWarnings({ "rawtypes", "unused" })//压制警告
     public static void main(String[] args) {
     Person person = new Person() ;
     }
}

