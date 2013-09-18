package my.test.collections.examples;


import java.util.*;

public class SetExample {

    static NavigableSet<Integer> sortedSet;

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
        System.out.println("**************************");

        sortedSet = new TreeSet<Integer>();
        sortedSet.add(2);
        sortedSet.add(4);
        sortedSet.add(6);
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(10);
        sortedSet.add(8);
        sortedSet.add(9);
        sortedSet.add(7);
        sortedSet.add(1);


        System.out.println(getNextElem(3));
        System.out.println(getPrevElem(3));

    }


    public static Integer getNextElem(Integer elem) {

        return sortedSet.higher(elem);
    }

    public static Integer getPrevElem(Integer elem) {

        return sortedSet.lower(elem);
    }

}
