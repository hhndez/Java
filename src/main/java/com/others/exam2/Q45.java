package com.others.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q45 {

    public static void main(String ...args) {
        Map numbers = new HashMap<>();

        numbers.put(1, "one");
        numbers.put(2, "two");

        BiConsumer func = (k , v) -> System.out.print("[" + k + "=" + v + "]");
        numbers.forEach(func);
    }
}
