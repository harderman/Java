import java.util.Scanner;

public class GetReward {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNextInt()) {
            int number = sca.nextInt();
            float probability =1 - (float)1/number;// Math.pow((double)1/number,number);
            probability *= 100;
            System.out.println(String.format("%.2f",probability)+"%");
        }
    }
}
