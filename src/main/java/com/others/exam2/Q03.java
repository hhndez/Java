package com.others.exam2;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q03 {
//    static int x = 7;

    public static void main(String ...args) {
        IntStream ins = IntStream.range(2,10);
        out.println(getSum(5, ins));
    }

    public static int getSum(int x, IntStream ins) {
  //      int x = 4;
        IntPredicate pre = in -> in > x;
        return ins.filter(pre).sum();
    }
}
