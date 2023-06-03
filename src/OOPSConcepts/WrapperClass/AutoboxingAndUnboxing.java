package OOPSConcepts.WrapperClass;

import java.util.ArrayList;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        //autoboxing (The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("ArrayList: " + list);

        // unboxing(The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.)
        int a = list.get(0);
        System.out.println("Value at index 0: " + a);
    }
}
