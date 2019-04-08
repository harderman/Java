package java_project;
class point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class text {
    public static void main(String[] args) {
        point <String>p = new point<String>();
        p.setX("西经180°");
        p.setY("南纬20°");
        String x = p.getX();
        String y = p.getY();
        System.out.println("X = "+x+",Y = " +y);

    }
}
