package com.others.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q83 {
    public static void main(String ...args) {
        Map numbers = new HashMap();

        numbers.put(1, "one");
        numbers.put(3, "Three");
        numbers.put(4, "Four");

        BiFunction func = (k,v) -> "Two";

        numbers.compute(2, func);

        out.println(numbers);

    }
}
