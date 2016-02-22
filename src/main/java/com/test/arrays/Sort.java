package com.test.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.Collections.*;
import static java.lang.System.out;

/**
 * Created by hhernandez on 22/09/15.
 */
public class Sort {
    public static void main(String ...args) {
        List<String> strings = new ArrayList<>();

        strings.add("x");
        strings.add("b");
        strings.add("a");

        sort(strings);

        strings.forEach(s -> out.println(s));

        sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return -(s.compareTo(t1));
            }
        });

        strings.forEach(s -> out.println(s));


    }
}
