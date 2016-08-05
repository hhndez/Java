package com.others.exam2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q62 {
    public static void main(String ...args) {
        List<String> list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        list.stream().peek(s -> s.concat(s.toLowerCase())).parallel().forEach(System.out::print);
    }
}
