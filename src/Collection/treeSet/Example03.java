package Collection.treeSet;

import java.util.TreeSet;

public class Example03 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Pradip");
        set.add("Ashok");
        set.add("Vishakha");
        set.add("Rutik");
        set.add("Ankit");
        set.add("Vanita");
        set.add("Vedanshi");

        for(String obj : set){
            System.out.println(obj);
        }
    }
}
