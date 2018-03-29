public class Chapter5 {
    public static class Pocket<E> {
        private E data;
        public void put(E d) {this.data = d;}
        public E get() {return this.data;}
    }
    enum AccountType{
        FUTSU, TOUZA, TEIKI;
    }
    public static void main(String[] args) {
        Pocket<String> p = new Pocket<>();
        p.put("1192");
        String s = p.get();
        System.out.println(s);
        System.out.println(AccountType.FUTSU);
    }

}