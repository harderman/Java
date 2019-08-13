package DayQuestion;

import java.util.*;

public class test {
       public static void main(String[] args) {
//         Scanner sca  =  new Scanner(System.in);
//       String n = sca.next();
//       String s ="hello java for mat jkn 12";
//       String s1 = s.replace(" ","");
           //"E:\\V1R2\product\fpgadrive.c   1325"
//           String n = "E:\\vir2\\product\\fpgadrive.c 1325";
//           String m = "E:\\V1R2\\product\\fpgadrive.c  1325";
//           String[] result = m.split("\\\\") ;
//           for (String s:result) {
//               System.out.println(s);
//           }
//           System.out.println(result.length);
//           System.out.println(result[1]);
//           System.out.println(n.substring(2));
//           String[] result = s.split(" ") ;
//           System.out.println(s.split(" ").length);
//           System.out.println(s.length());
//           System.out.println(s.startsWith("o",4));
 //          System.out.println(s1);
//           Set<String> set = new TreeSet<>();
//           set.add("DayQuestion.Student");
//           set.add("a");
//           set.add("am");
//           set.add("i");
//           for (String s:set) {
//               System.out.print(s + " ");
//               Map<String ,Integer> map = new HashMap<>();
//           map.put("asdad",0);
//           map.put("asdad",1);
//           map.put(n,1);
//          String[] A = map.keySet().toArray(new String[0]);
//          Integer[] B = map.values().toArray(new Integer[0]);
//         for(int i = 0;i<A.length;i++){
//             System.out.println(A[i]+" "+B[i]);
//         }

//           if(map.keySet().equals("asdad")){
//               System.out.println("5");
//           }
//           System.out.println(map.keySet());
//           Stack<Integer> stack = new Stack<>();
//         Queue<Integer> queue = new LinkedList<>();
           }

    public int countWays(int n) {
        // write code here
        int[] value = new int[3];

        long[] dp = new long[n + 1];
        dp[0] = 1;
        for(int i = 0;i<3;i++){
            value[i] = i+1;
            for(int j = n;j>=0;j--) {
                if (j >= value[i]) {
                    dp[j] += dp[j - value[i]];
                }
            }
        }
        return (int)dp[n];
    }
    public void reOrderArray(int [] array) {

    }
}

/*

12<br/>4873279<br/>ITS-EASY<br/>888-4567<br/>
3-10-10-10<br/>888-GLOP<br/>TUT-GLOP<br/>967-11-11<br/>
310-GINO<br/>F101010<br/>888-1200<br/>-4-8-7-3-2-7-9-<br/>
487-3279<br/>4<br/>UTT-HELP<br/>TUT-GLOP<br/>310-GINO<br/>000-1213
 */