package DayQuestion;

import java.util.ArrayList;
import java.util.Scanner;

class Judge{
    static String judge(ArrayList<Integer> arrayList, int max){
        if(arrayList.size()<3){
            return "NO";
        }
        int length = arrayList.size();
        int num = 0;
        for(int i = 0;i<length;i++){
            num += arrayList.get(i);
        }
        if(num-max>max){
            return "Yes";
        }
        return "No";
    }
}
public class SimplePolygon {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int max = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        String[] result = new String[n];
        for (int i = 0;i<n;i++){
            int type = sca.nextInt();
            int length = sca.nextInt();
            if(length>max){
                max = length;
            }
            if(type == 1){
                arrayList.add(length);
                result[i] = Judge.judge(arrayList,max);
            }
            if(type == 2){
                arrayList.remove(new Integer(length));
                result[i] = Judge.judge(arrayList,max);
            }
        }
        for (String aResult : result) {
            System.out.println(aResult);
        }
    }
}
