package Collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRemoveAll {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");
        list.add(null);

        HashSet<String> list2 = new HashSet<String>();
        list2.add("Ankit");
        list2.add("Vanita");
        list2.add("Vaidanshi");
        list2.add("Vishakha");
        list2.add("Jayesh");
        list2.add("Rutik");

        list.removeAll(list2);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
