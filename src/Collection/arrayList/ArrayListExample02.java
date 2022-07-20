package Collection.arrayList;

import java.util.ArrayList;

public class ArrayListExample02 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(0,1);
        list.add(1,true);
        list.add(2,"Pradip");
        list.add(3,15.55);

        for(Object test:list){
            System.out.println(test);
        }

    }
}
