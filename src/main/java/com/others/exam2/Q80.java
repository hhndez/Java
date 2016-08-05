package com.others.exam2;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q80 {
    public static void main(String ... args) {
        new A80(){}.print();
    }
}

interface A80 {
    default void print() {
        out.println("A");
    }
}
