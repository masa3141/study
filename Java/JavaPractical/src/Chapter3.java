import java.util.*;

public class Chapter3 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        for(int i : points) {
            System.out.println(i);
        }

        Iterator<Integer> it = points.iterator();
        while(it.hasNext()) {
            Integer e = it.next();
            System.out.println(e);
        }

//        コレクションのインスタンスは、あいまいなインターフェイスを利用する
        List<Integer> list = new LinkedList<>();
        list.add(45);
        for(int i : list) {
            System.out.println(i);
        }

        Map<String, Integer> prefs = new HashMap<>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 182);
        for(String key: prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value);
        }
    }
}
