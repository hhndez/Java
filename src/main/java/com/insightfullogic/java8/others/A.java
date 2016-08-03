package com.insightfullogic.java8.others;

import static java.lang.System.out;
/**
 * Created by Optiplex on 13/07/16.
 */
public class A {
    public void test () throws Exception {
        out.println("A implementation");
    }

    public static void main (String... args) {
        A a = new B();
        B b = new B();
        out.println("Primera invocacion");
        try {
            a.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("Segunda invocacion");
        try {
            b.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B extends A {
    @Override
    public void test() throws ClassNotFoundException {
        out.println("B implementation");
        throw new NullPointerException("Test");
    }
}
