package DayQuestion;
        import java.util.*;
        import java.util.stream.Stream;

public class FileWrongTimesCount {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Map<String ,Integer> map = new HashMap<>();
        while(sca.hasNext()){
            String str = sca.nextLine();
            String[] strings = str.split("\\\\");
           list.add(str);
           int count = 0;
           for(int i = 0;i<list.size();i++){
               str.equals(list.get(i));
               count++;
           }
            System.out.println(strings[strings.length-1]);
//            list.add(str);
//            Stream<String > stream = list.stream();
//            System.out.println(strings[strings.length-1]+" "+stream.filter((e)->e.contains(str)).count());
//            String[] A = map.keySet().toArray(new String[0]);
//            Integer[] B = map.values().toArray(new Integer[0]);
//            for(int i = 0;i<A.length;i++){
//                System.out.println(A[i]+" "+B[i]);
//            }
        }
    }
}
