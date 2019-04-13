package java_project;

enum Sex {
    MALE,FEMALE
}

public class text_enmu {
    public static void main(String[] args) {
        switch(Sex.MALE) {
            case MALE :
                System.out.println("男人");
                break ;
            case FEMALE :
                System.out.println("女人");
                break ;
        }
    }
}
