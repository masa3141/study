import java.util.Iterator;
import java.util.Properties;

public class Chapter7 {
    public static void main(String[] args) {
        if(1==2){
            System.exit(1);
        }
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        while(i.hasNext()){
            String key = i.next();
            System.out.print(key + "=");
            System.out.println(System.getProperty(key));
        }

    }
}