package Collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example02 {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(2);

        Iterator<Object> itr= treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
