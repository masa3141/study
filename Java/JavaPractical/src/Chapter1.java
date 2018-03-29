public class Chapter1 {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if(s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if(s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは" + s1.length() + "です");

//        文字列の連結
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000; i++){
            sb.append("Java");
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
