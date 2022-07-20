package Collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0,1);
        list.add(1,true);
        list.add(2,"Pradip");
        list.add(3,15.55);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
