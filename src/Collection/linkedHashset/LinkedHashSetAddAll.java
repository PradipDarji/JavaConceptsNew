package Collection.linkedHashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetAddAll {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");
        list.add(null);

        LinkedHashSet<String> list2 = new LinkedHashSet<String>();
        list.add("Ankit");
        list.add("Vanita");
        list.add("Vaidanshi");

        list.addAll(list2);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
