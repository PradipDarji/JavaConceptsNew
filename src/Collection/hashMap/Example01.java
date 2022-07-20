package Collection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Example01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "test01");
        map.put(1, "test02");
        map.put(2, "test06");
        map.put(3, "test09");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
