package com.others.exam2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q42 {
    private AtomicInteger value = new AtomicInteger(10);
    public static void main(String ...args) {
        Q42 at = new Q42();
        System.out.println(at.value.addAndGet(5));

        /*
        Q42 at1 = new Q42();
        at1.value = at1.value.
        System.out.println(at1.value.intValue());*/
    }
}
