package com.others.exam2;

import java.util.stream.Stream;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q41 {
    public static void main(String ...args) {
        //Stream ints = Stream.of(33, 234, 1, 25, -5, 100);
        Stream<Integer> ints = Stream.of(33, 234, 1, 25, -5, 100);
        int min = ints.reduce(Integer.MIN_VALUE, Integer::min);
        System.out.println(min);
    }
}
