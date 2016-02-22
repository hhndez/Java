package com.test.streams;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample07 {

    /**
     * Realiza la suma de los elementos.
     * @param args
     */
    public static void main(String ...args ) {

        int count = Stream.of(1,2,3)
                .reduce(0, (acc, element) -> acc + element);

        assertEquals(6, count);
    }
}
