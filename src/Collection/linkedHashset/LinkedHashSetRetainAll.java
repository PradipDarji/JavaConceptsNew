package Collection.linkedHashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetRetainAll {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");
        list.add(null);

        LinkedHashSet<String> list2 = new LinkedHashSet<String>();
        list2.add("Ankit");
        list2.add("Vanita");
        list2.add("Vaidanshi");
        list2.add("Vishakha");
        list2.add("Jayesh");
        list2.add("Rutik");

        list.retainAll(list2);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
