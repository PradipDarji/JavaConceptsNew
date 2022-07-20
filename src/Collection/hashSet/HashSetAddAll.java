package Collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAddAll {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");
        list.add(null);

        HashSet<String> list2 = new HashSet<String>();
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
