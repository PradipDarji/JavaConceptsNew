package Collection.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example01 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer(25, "Rohit", 25000));
        list.add(new Customer(22, "Ashok", 2000));
        list.add(new Customer(65, "Keval", 55000));
        list.add(new Customer(45, "Chirag", 45000));
        list.add(new Customer(55, "Vitrang", 75000));

        System.out.println("Sorting by Age......");
        Collections.sort(list, new AgeComparator());
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Customer cc = (Customer) itr.next();
            System.out.println(cc.Name + " " + cc.age + " " + cc.Salary);
        }
        System.out.println("Sorting by name......");
        Collections.sort(list, new NameComparator());
        Iterator itr01 = list.iterator();
        while (itr01.hasNext()) {
            Customer cc = (Customer) itr01.next();
            System.out.println(cc.Name + " " + cc.age + " " + cc.Salary);
        }
        System.out.println("Sorting by Salary......");
        Collections.sort(list, new SalaryComparator());
        Iterator itr02 = list.iterator();
        while (itr02.hasNext()) {
            Customer cc = (Customer) itr02.next();
            System.out.println(cc.Name + " " + cc.age + " " + cc.Salary);
        }
    }
}
