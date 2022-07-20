package Collection.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");

        ListIterator itr = list.listIterator();
        System.out.println("Element getting in forward direction");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Element getting in backward direction");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }

}
