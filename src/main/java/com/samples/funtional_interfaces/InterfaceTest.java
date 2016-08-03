package com.samples.funtional_interfaces;

import static java.lang.System.out;
/**
 * Created by Optiplex on 02/08/16.
 */
public interface InterfaceTest {
    default void println() {

    }

    static void println(String x) {
        out.println(x);
    }
}
