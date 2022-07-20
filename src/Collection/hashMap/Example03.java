package Collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example03 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "test01");
        map.put(1, "test02");
        map.put(1, "test05");
        map.put(2, "test06");
        map.put(3, "test09");

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry  entry  = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
