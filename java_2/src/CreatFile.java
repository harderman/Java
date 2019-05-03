import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
    File file = new File("E:/chengxu/IO_text/text_io.java");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(file.exists()) {
            file.delete();
            System.out.println("file has been created");
        } else
            file.createNewFile();
    }
}
