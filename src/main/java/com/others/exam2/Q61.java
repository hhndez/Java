package com.others.exam2;

import java.util.function.Function;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q61 {
    public static void main(String ...args) {
        Function<Integer, Double> area = in -> in / 2.0;
        Function<String, Integer> converter = in -> Integer.valueOf(in);
        Function combined = area.compose(converter);
        System.out.println("Radius=" + combined.apply("7"));

    }
}
