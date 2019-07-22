package DayQuestion;

import java.util.Scanner;
import java.util.Stack;
//Emacs编辑器自带的计算器
/*
3<br/>2 3 +<br/>5<br/>2 2 + 3 *<br/>5<br/>2 2 3 + *
5<br/>12<br/>10
+43-45*42/47
数字从30开始
 */
//OJ不过老是说越界
public class EmacsCalculator {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int times = sca.nextInt();
        int i = 0;
        Stack<String> str = new Stack<>();
        for (; i < times; i++) {
            String law = sca.next();
            switch (law) {
                case "+":
                    int c = Integer.valueOf(str.pop());
                    if(str.isEmpty()){
                        str.push("-1");
                        break;
                    }
                    str.push(String.valueOf(Integer.valueOf(str.pop()) - c));
                    break;
                case "-":
                    int b = Integer.valueOf(str.pop());
                    Check(str);
                    str.push(String.valueOf(Integer.valueOf(str.pop()) - b));
                    break;
                case "*":
                    int d = Integer.valueOf(str.pop());
                    Check(str);
                    str.push(String.valueOf(Integer.valueOf(str.pop()) - d));
                    break;
                case "/":
                    int a = Integer.valueOf(str.pop());
                    Check(str);
                    if (a == 0) {
                        throw new UnsupportedOperationException("除数不能为0");
                    }
                    str.push(String.valueOf(Integer.valueOf(str.pop()) / a));
                    break;
                default:
                    str.push(law);
            }

        }
        //throw new UnsupportedOperationException("除数不能为0");

            System.out.println(str.pop());
    }

public static void Check(Stack<String> strings){
        if(strings.isEmpty()){
            strings.push("0");
        }
    }
}
