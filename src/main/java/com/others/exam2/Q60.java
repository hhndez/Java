package com.others.exam2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q60 {
    public static void main(String ...args ) {
        //List numbers = Arrays.asList(1,2,3,4,4,6,6);
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,6,6);
        System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToInt(i -> i).sum());
    }
}
