package DayQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Text_sort {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(9);
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<=o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        for (int i:arrayList){
            System.out.println(i);
        }

    }
}
