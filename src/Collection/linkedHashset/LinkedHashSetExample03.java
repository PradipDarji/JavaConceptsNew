package Collection.linkedHashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample03 {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");
        list.add(null);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String test:list){
            System.out.println(test);
        }

    }
}
