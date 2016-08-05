package com.others.exam2;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q57 {
    public static void main(String ...args) {
        new Sub().print("A ");
        new Sup().print();
    }
}

class Sup{
    protected void print() {
        out.print("A ");
    }
}

class Sub extends Sup {
    public void print() {
        out.print("B ");
    }

    void print(String s) {
        out.print(s);
    }
}
