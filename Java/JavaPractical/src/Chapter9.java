import java.io.FileWriter;
import java.io.IOException;

public class Chapter9 {
    public static void main(String[] args){
//        FileWriter fw = new FileWriter("test.txt", true);
        FileWriter fw = null;
        try {
            fw = new FileWriter("test.txt", false);
            fw.write("A");
            fw.flush();
        } catch (IOException e) {
            System.out.println("ファイル書き込みエラーです");
        } finally {
            if(fw != null) {
                try{
                    fw.close();
                } catch (IOException e2) {

                }
            }
        }
        }
}