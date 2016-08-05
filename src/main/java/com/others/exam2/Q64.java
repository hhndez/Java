package com.others.exam2;

import java.util.Map;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.UnaryOperator;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q64 {
    public static void main(String ... args) {
        Function<Double, Double> eq = in -> Math.sqrt(in);

        DoubleFunction<Double> eq1 = in -> Math.sqrt(in);

        UnaryOperator<Double> eq2 = in -> Math.sqrt(in);

        ToDoubleFunction<Double> eq3 = in -> Math.sqrt(in);

        System.out.println(eq.apply(25d));
        System.out.println(eq1.apply(25d));
        System.out.println(eq2.apply(25d));
        System.out.println(eq3.applyAsDouble(25d));


    }
}
