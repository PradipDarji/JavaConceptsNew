package Collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample03 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Pradip");
        list.add("Ashok");
        list.add("Vishakha");
        list.add("Jayesh");
        list.add("Rutik");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String test:list){
            System.out.println(test);
        }

    }
}
