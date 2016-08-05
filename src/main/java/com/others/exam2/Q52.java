package com.others.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q52 {

    public static void main(String ...args) {
        Map numbers = new HashMap();
        Map numbers2 = new HashMap();

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers2.put(3, "three");
        numbers2.put(4, "Four");

        BiFunction func = (k,v)-> v;

        BiConsumer cons = (k, v) -> numbers.merge(k , v, func);
        numbers2.forEach(cons);
        System.out.println(numbers);
    }
}
