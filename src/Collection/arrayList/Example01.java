package Collection.arrayList;

import java.util.*;

public class Example01 {
    public static void main(String[] args) {

        List list01 = new ArrayList<>();
        List list02 = new LinkedList<>();
        List list03 = new Vector<>();
        List list04 = new Stack<>();

        ArrayList list05 = new ArrayList();
        LinkedList list06 = new LinkedList();

        ArrayList<Integer> list07 = new ArrayList<Integer>();
        LinkedList<Object>list08 = new LinkedList<Object>();

        Queue q1 = new PriorityQueue();
        Queue q2 = new ArrayDeque();

        PriorityQueue q3 = new PriorityQueue<>();
        ArrayDeque q4 = new ArrayDeque<>();

        Set s1 = new HashSet();
        Set s3 = new LinkedHashSet();
        Set s2 = new TreeSet();

        HashSet h1 = new HashSet();
        LinkedHashSet h2 = new LinkedHashSet();
        TreeSet h3 = new TreeSet();

    }
}
