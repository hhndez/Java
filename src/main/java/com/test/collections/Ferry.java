package com.test.collections;

import java.util.TreeSet;

import static java.lang.System.out;
/**
 * Created by hhernandez on 22/09/15.
 */
public class Ferry {
    public static void main(String... args) {
        TreeSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        //JAVA 5
        TreeSet<Integer> subset = (TreeSet) times.headSet(1600);
        System.out.println("JAVA 5 last before 1600 is: " + subset.last());

        subset = (TreeSet) times.tailSet(2000);
        out.println("JAVA 5 first after 2000 is " + subset.first());


        //JAVA 6
        out.println("JAVA 6: Last before 1600 is: " + times.lower(1600));
        out.println("JAVA 6: Last before 1600 is: " + times.floor(1600));
        out.println("JAVA 6: Last before 1545 is: " + times.lower(1545));
        out.println("JAVA 6: Last before 1545 is: " + times.floor(1545));

        out.println("JAVA 6: First after 2000 is: " + times.higher(2000));
        out.println("JAVA 6: First after 2000 is: " + times.ceiling(2000));
        out.println("JAVA 6: First after 2100 is: " + times.higher(2010));
        out.println("JAVA 6: First after 2100 is: " + times.ceiling(2010));

    }
}
