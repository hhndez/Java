package com.others.exam2;

import java.util.Optional;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q10 {
    public static void main(String ...args) {
        String[] in = new String[3];
        String op1 = Optional.of(in[2]).orElse("Empty");
        out.println(op1);
    }
}
