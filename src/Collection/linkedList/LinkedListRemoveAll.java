package Collection.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveAll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");

        ArrayList<String> list2 = new ArrayList<String>();
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
