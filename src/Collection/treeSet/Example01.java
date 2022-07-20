package Collection.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example01 {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet();
        treeset.add(1);
        treeset.add(0);
        treeset.add(5);
        treeset.add(6);
        treeset.add(3);
        treeset.add(2);

        Iterator itr= treeset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
