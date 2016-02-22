package com.test.cast;

import static java.lang.System.*;

/**
 * Created by hhernandez on 17/09/15.
 */
public class Primitive {

    public static void main(String ...args) {
        long l = 32;

        long l1 = 1_000_000;
        long l2 = 1__000_000;

        int l3 = 0b1_000_0;

        double d = 32_323.23;

        byte b = 127;

//byte b1 = 128; Compiler error.
        System.out.println("byte=A" + ((byte) 128));

        out.println( "MODULO:" + (21 % 5));


        b += 5;
        //b = b + 5; No compila, hasta hacer el cast.


    }
}
