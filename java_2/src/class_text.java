
interface Study{}

interface Grade{}
class Math implements Study,Grade{}

public class class_text {
    public static void main(String[] args) {
        Class<?> math = Math.class;
        System.out.println(math.getName());
        System.out.println(math.getSuperclass().getName());
       Class<?>[] iClass = math.getInterfaces();
        for (Class<?> class1:iClass) {
            System.out.println(class1.getName());
        }
    }

}

