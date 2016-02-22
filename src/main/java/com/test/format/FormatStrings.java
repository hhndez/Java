package com.test.format;

import java.util.Locale;

import static java.lang.System.*;
/**
 * Created by hhernandez on 21/09/15.
 */
public class FormatStrings {

    public static void main (String ...args) {

        Locale l = new Locale("US");
        int i1 = -123;
        int i2 = 12345;

        out.printf(l, ">%1$-(7d< \n", i1);
        out.printf(l, ">%0,7d< \n", i2);
        out.format(l, ">%+-7d< \n", i2);
        out.printf(l, ">%2$b + %1$5d< \n", i1, false);

    }

}
