package Collection.linkedHashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample01 {
    public static void main(String[] args) {
        LinkedHashSet list = new LinkedHashSet();
        list.add(1);
        list.add(true);
        list.add("Pradip");
        list.add(15.55);
        list.add(null);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
