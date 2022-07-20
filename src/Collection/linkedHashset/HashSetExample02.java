package Collection.linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample02 {
    public static void main(String[] args) {
        LinkedHashSet<Object> list = new LinkedHashSet();
        list.add(1);
        list.add(true);
        list.add("Pradip");
        list.add(15.55);
        list.add(null);

        for(Object obj:list) {
            System.out.println(obj);
        }

    }
}
