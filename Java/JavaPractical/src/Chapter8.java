import org.apache.commons.lang3.builder.EqualsBuilder;

public class Chapter8 {
    public static class Bank{
        String name;
        String address;
        public boolean equals(Object o) {
            return EqualsBuilder.reflectionEquals(this, o);
        }
    }
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "test";
        Bank b2 = new Bank();
        System.out.println(b1.equals(b2));
    }
}
