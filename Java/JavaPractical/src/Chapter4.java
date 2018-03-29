import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter4 {
    //staticにする意味は？
    private static class Hero implements Comparable<Hero>{
        private String name;
        private int hp, mp;

        public String toString() {
            return "勇者（名前=" + this.name +
                    "/HP=" + this.hp + "/MP" + this.mp + ")";
        }

        public boolean equals(Object o){
            Hero h = (Hero) o;
            if(h.name == this.name) return true;
            return false;
        }

        public int hashCode() {
            int result = 37;
            result = result * 31 + name.hashCode();
            result = result * 31 + hp;
            return result;
        }
        public int compareTo(Hero obj) {
            if(this.hp < obj.hp){
                return -1;
            }
            if(this.hp > obj.hp){
                return 1;
            }
            return 0;
        }
    }
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.name = "aa";
        hero.hp = 159;
        System.out.println(hero);
        Hero hero2 = new Hero();
        hero2.name = "1";
        hero2.hp = 100;
        System.out.println(hero2);
        if(hero.equals(hero2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        List<Hero> list = new ArrayList<Hero>();
        list.add(hero);
        list.add(hero2);
        Collections.sort(list);
        System.out.println(list);
    }
    // equalsをオーバライドしていないと、リストに追加して、その要素を削除するときに、どの要素が目的の要素か分からず、削除できない
}
