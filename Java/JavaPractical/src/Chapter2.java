import java.util.Date;

public class Chapter2 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1216622225935L);
        System.out.println(past);
    }
}
