package com.others.exam2;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q13 extends Labs implements A13 {
    public static void main(String ...args) {
        new Q13().print();
    }
}

class Labs {
    public void print() {
        out.println("Labs");
    }
}

interface A13 {
    default void print() {
        out.print("A");
    }
}
