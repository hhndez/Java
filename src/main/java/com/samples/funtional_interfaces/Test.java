package com.samples.funtional_interfaces;

import java.util.function.*;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Test {
    public static void main(String ...args) {
        IntToLongFunction r = i -> new Long(i);

        IntUnaryOperator r1 = i -> i +1;

        LongFunction r2 = i -> new Long(i).toString();

        LongSupplier r3 = () -> Long.MAX_VALUE;

        ObjDoubleConsumer<String> r4 = (o,d) -> {  };

        Predicate r5 = x -> true;

        ToDoubleBiFunction<String, Integer> r6 = (s, i) -> new Double(i);


    }
}
