package com.others.exam2;

import java.util.function.DoubleFunction;
import java.util.function.Function;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q36 {

    public static void main(String ...args ){
        double [] marks = {49, 64, 81, 50};
        DoubleFunction sq = Math::sqrt;
        System.out.println(sq.apply(marks[1]));
    }
}
