package Collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(0,100);
        list.add(1,true);
        list.add(2,"QA Engineer");
        list.add(3,19.55);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
