package Collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample03 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<String>();
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
