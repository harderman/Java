package DayQuestion;

import java.util.*;

//_i  am 55a !@# student
public class backWords {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        while(sca.hasNextLine()){
            Set<String> set = new TreeSet<>();
            String words = sca.nextLine();
            String willBack = check(words);
            String[] Back = willBack.split(" ");
            for(int i = Back.length-1;i>=0;i--){
               set.add(Back[i]);
            }
            for (String s:set) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static String check(String s){
        char[] a = s.toCharArray();
        for(int i = 0;i<a.length;i++){
            if(!(a[i]>='A'&&a[i]<='Z')&&!(a[i]>='a'&&a[i]<='z')){
                a[i] = ' ';
            }
        }
        return String.valueOf(a);
    }
}
