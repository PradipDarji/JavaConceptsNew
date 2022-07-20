package Collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example04 {
    public static void main(String[] args) {
        Person person01 = new Person(29,"Pradip","Male");
        Person person02 = new Person(26,"Vishakha","Female");
        Person person03 = new Person(61,"Ashok","Male");
        Person person04 = new Person(20,"Rutik","Male");
        Person person05 = new Person(28,"Ankit","Male");
        Person person06 = new Person(26,"Vanita","Female");
        Person person07 = new Person(3,"Vedanshi","Female");

        ArrayList<Person> set = new ArrayList<Person>();
        set.add(person01);
        set.add(person02);
        set.add(person03);
        set.add(person04);
        set.add(person05);
        set.add(person06);
        set.add(person07);

        Iterator<Person> itr = set.iterator();
        while(itr.hasNext()){
            Person person = (Person) itr.next();
            System.out.println(person.age+" "+person.Gender+" "+person.Name);
        }
    }
}
