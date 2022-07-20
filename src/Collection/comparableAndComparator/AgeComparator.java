package Collection.comparableAndComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Customer s1 = (Customer) o1;
        Customer s2 = (Customer) o2;

        if(s1.age==s2.age){
            return 0;
        }else if(s1.age>s2.age){
            return 1;
        }else{
            return -1;
        }
    }
}
