package DayQuestion;

        import java.util.Scanner;

public class helpCpuls {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String cName = sca.next();
            String[] JavaName = cName.split("_");
            StringBuffer sb = new StringBuffer();
            sb = sb.append(JavaName[0]);
            for(int i =1;i<JavaName.length;i++){
                // JavaName[i] = JavaName[i].replaceAll("_","");
                JavaName[i] = JavaName[i].substring(0,1).toUpperCase()+JavaName[i].substring(1);
                sb = sb.append(JavaName[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
