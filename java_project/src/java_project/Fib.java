package DayQuestion;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        int[] array = new int[31];
        for(int i = 0;i<31;i++){
            array[i] = find(i);
        }
        Scanner sca = new Scanner(System.in);
        int str =sca.nextInt();
        int min = str - array[0];
        for(int i = 0;i<31;i++){
            if(Math.abs(str - array[i])<min){
                min = Math.abs(str - array[i]);
            }
        }
        System.out.println(min);
    }
    public static int find(int i){
        if(i == 0){
            return 0;
        }if(i == 1){
            return 1;
        }
        return find(i-1)+find(i-2);
    }

}
