import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigNumberSort {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            BigInteger[] big = new BigInteger[n];
            for(int i = 0;i<big.length;i++){
                big[i] = sca.nextBigInteger();
            }
            Arrays.sort(big);
            for(int i = 0;i<big.length;i++){
                System.out.println(big[i]);
            }
        }
    }
}
