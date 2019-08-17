package DayQuestion;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int[] result = new int[1000];
        int index = 0;
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int number = sca.nextInt();
            if(number == 0||number >= 1000){
                break;
            }
            int[] grades = new int[number];
            for(int i = 0;i<grades.length;i++){
                grades[i] = sca.nextInt();
            }
            int find = sca.nextInt();
            for(int i = 0;i<grades.length;i++){
                if(grades[i] == find){
                    result[index] = result[index]+1;
                }
            }
            index++;
        }
        for(int i=0;i<index;i++){
            System.out.println(result[i]);
        }
    }
}
