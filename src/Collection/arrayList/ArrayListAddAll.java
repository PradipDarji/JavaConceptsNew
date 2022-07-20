package Collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");

        ArrayList<String> list2 = new ArrayList<String>();
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
