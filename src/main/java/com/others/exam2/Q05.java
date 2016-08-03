package com.others.exam2;

import java.util.stream.DoubleStream;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q05 {

    public static void main(String ... args) {
        DoubleStream doubles = DoubleStream.of(0.45, 0.42, 0.49);
        System.out.println(doubles.filter(e -> e>0.45).count());
    }
}
