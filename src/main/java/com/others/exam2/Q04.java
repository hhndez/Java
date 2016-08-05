package com.others.exam2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q04 {
    public static void main(String ...args) {
        Set list = new HashSet();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        list.forEach(System.out::print);

    }
}
