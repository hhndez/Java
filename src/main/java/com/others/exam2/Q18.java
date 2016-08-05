package com.others.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q18 {

    static int $ = 4;

    public static void main(String ...args) {

        List numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(7);

        int _ = 4;

/*
        Predicate predit = p -> p > 4;
        Consumer cons = System.out::println;
        Consumer cons1 = i -> System.out.print(i + "");*/

        Stream s = Stream.of("abc", "def", "xyz");
        Consumer cons = System.out::println;
        s.forEachOrdered(cons);


    }
}
