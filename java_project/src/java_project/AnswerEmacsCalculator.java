package DayQuestion;
//Emacs编辑器自带的计算器
/*
3<br/>2 3 +<br/>5<br/>2 2 + 3 *<br/>5<br/>2 2 3 + *
5<br/>12<br/>10
*/
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
public class AnswerEmacsCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<String> list = new ArrayList<String>();
            int n=sc.nextInt();
            if(n<3) continue;
            for(int i=0;i<n;i++){
                list.add(sc.next());
            }
            while(list.size()!=1){
                int size = list.size();
                int num=0;
                for(int i=0;i<size;i++){
                    if(list.get(i).equals("+")){
                        num = Integer.valueOf(list.get(i-2))+Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("-")){
                        num = Integer.valueOf(list.get(i-2))-Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("*")){
                        num = Integer.valueOf(list.get(i-2))*Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }else if(list.get(i).equals("/")){
                        num = Integer.valueOf(list.get(i-2))/Integer.valueOf(list.get(i-1));
                        list.remove(i-2);list.remove(i-2);list.remove(i-2);
                        list.add(i-2, Integer.toString(num));
                        break;
                    }

                }
            }
            System.out.println(list.get(0));
        }

        sc.close();
    }
}