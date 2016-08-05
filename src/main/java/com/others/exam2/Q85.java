package com.others.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q85 {
    public static void main(String ...args) {
        //List ints = new ArrayList();
        List<Integer> ints = new ArrayList();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        //Optional op1 = Optional.of(ints.get(2));
        Optional<Integer> op1 = Optional.of(ints.get(2));
        op1.ifPresent(in -> out.println(in * 2));

    }
}
