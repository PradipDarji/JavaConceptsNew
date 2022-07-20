package Collection.hashSet;

import java.util.HashSet;

public class HashSetExample02 {
    public static void main(String[] args) {
        HashSet<Object> list = new HashSet();
        list.add(1);
        list.add(true);
        list.add("Pradip");
        list.add(15.55);
        list.add(null);

       for(Object t1:list){
           System.out.println(t1);
       }
    }
}
