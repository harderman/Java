public class varying_parameter {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1,3,5,7,9}));
        System.out.println(add(2,4,6,8,10));
    }

    public static int add(int...number){
        int result = 0;
        for (int i =0;i < number.length;i ++){
            result += number[i];
        }
        return result;
    }
}
