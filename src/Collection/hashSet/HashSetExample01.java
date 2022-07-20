package Collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample01 {
    public static void main(String[] args) {
        HashSet list = new HashSet();
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
