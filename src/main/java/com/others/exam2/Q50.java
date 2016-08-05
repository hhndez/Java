package com.others.exam2;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q50 {
    public static void main(String ... args) {

        X50 x = i -> Integer.toString(i);

        System.out.println(x.method(10));

    }
}

interface X50 {
    public abstract String method(Integer i);
}
