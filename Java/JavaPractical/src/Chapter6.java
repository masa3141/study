import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Chapter6 {
    public static void main(String[] args) {
//        ラムダ式
        IntBinaryOperator func = (int a, int b) -> {return a -b ;};
        int a = func.applyAsInt(5, 3);
        System.out.println("5-3=" + a);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.stream().forEach(i -> System.out.println(i*2));
    }
}