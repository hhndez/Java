package com.test.inner;

import static java.lang.System.*;
/**
 * Created by hhernandez on 24/09/15.
 */
public class InnerCrazy {

    public static void main(String ...args) {

        InnerCrazy crazy = new InnerCrazy();
    }

    public void somethingCrazy() {
        MyAbstractClass abstractClass = new MyAbstractClass() {
            @Override
            void doingSomething() {

            }
        };
    }
}

interface MyInterface1 {

}

interface MyInterface2 {

}

abstract class MyAbstractClass{
     abstract void doingSomething();
}

class Trade {
    public void doTrade() {}
}


