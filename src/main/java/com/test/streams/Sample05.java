package com.test.streams;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample05 {

    /**
     * Une dos streams.
     * @param args
     */
    public static void main(String ...args) {
        List<Integer> together = Stream.of(asList(1,2), asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(toList());

        assertEquals(asList(1,2,3,4), together);
    }
}
