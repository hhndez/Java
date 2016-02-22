package com.test.operators;

//import statics java.lang.System.out.*; error compilation
import static java.lang.System.*;
import static java.lang.System.out;

/**
 * Created by hhernandez on 17/09/15.
 */
public class Test {

    public static void main (final String ... args) {
        int a = 3;
        int b = 7;
        String c = "HIU";
        System.out.println(a + b + c);


        test(new int[][][] { {{1,2}}, {{3,4}}});
    }

    static void test(int[][][] array) {
        out.println("size=" + array.length);
    }
}
