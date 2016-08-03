package com.others.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q12 {

    public static void main(String ... args) {
        List strings = new ArrayList<>();
        strings.add("Shane");
        strings.add(null);
        strings.add("Rachel");

        Optional op1 = Optional.ofNullable(strings.get(1));

        System.out.println(op1.get());

    }
}
