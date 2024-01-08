package ex13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();                  // 순서가 일정하지 않다
//        LinkedHashSet<String> set = new LinkedHashSet<>();    // 입력 순서
        TreeSet<String> set = new TreeSet<>();                // 알파벳 순서

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Tomato");
        set.add("Tomato");

        System.out.println(set);

        if (set.contains("Tomato")) {       // contain() : 데이터가 있는지 없는지 여부를 반환
            System.out.println("토마토가 포함돼 있습니다.");
        }
    }
}
