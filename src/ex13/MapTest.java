package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Kenneth", "1234");
        map.put("Minsu", "pass");
        map.put("Kim", "word");

        System.out.println(map.get("Kim")); // keySet()은 키들의 집한을 반환합니다.

        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        map.remove(3);
        map.put("choi", "password");
        System.out.println(map);
    }
}
