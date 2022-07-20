package Collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAddAll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");

        LinkedList<String> list2 = new LinkedList<String>();
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
