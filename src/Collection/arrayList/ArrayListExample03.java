package Collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
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
