package com.test.inner;

import static java.lang.System.*;
/**
 * Created by hhernandez on 24/09/15.
 */
public class MyOuter2 {
    private String x = "Outer2";
    void doStuff() {
        String z = "local variable";


        final class MyInner {
            public void seeOuter() {
                out.println("x is: " + x);
                out.println("z is: " + z);
            }
        }

        MyInner $ = new MyInner();
        $.seeOuter();

    }

    public static void main(String ...args) {
        MyOuter2 _ = new MyOuter2();
        _.doStuff();
    }
}
