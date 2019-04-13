
interface  Isubject{
    public String getSubject();
}

enum Project implements Isubject{
    math("数学"),English("英语"),Chinese("语文");
    private String subject;
    @Override
    public String toString() {
        return this.subject;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    private Project(String subject){
        this.subject = subject;
    }
  }

public class text_0412 {
    public static void main(String[] args) {
        for (Project temp:Project.values()) {
            System.out.println(temp.ordinal()+" "+temp.name());
        }
    Isubject isubject = Project.Chinese;
        System.out.println(isubject.getSubject());
    }
}
