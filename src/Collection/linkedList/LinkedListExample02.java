package Collection.linkedList;

import java.util.LinkedList;

public class LinkedListExample02 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add(0,100);
        list.add(1,true);
        list.add(2,"QA Engineer");
        list.add(3,19.55);

        for(Object test:list){
            System.out.println(test);
        }
    }
}
