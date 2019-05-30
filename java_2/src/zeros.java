import java.util.Scanner;

public class zeros {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int number = str.nextInt();
        int resoult = 0;
        for(int i = 5;i <= number;i++){
            int temp = i;
            while(temp%5 ==0){
                resoult++;
                temp /= 5;
            }
        }
        System.out.println(resoult);
    }
}

