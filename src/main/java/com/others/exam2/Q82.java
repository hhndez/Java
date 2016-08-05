package com.others.exam2;

import java.util.stream.IntStream;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q82 {
    public static void main(String... args) {
        IntStream ints = IntStream.of(10,20,30);
        ints.peek(d-> System.out.print(d * 2 + " ")).count();
    }
}
