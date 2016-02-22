package com.test.streams;

import java.util.ArrayList;
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
public class Sample03 {

    /**
     * Convierte a mayuscula sus elementos.
     * @param args
     */
    public static void main(String... args) {

        /**
         * OLD STYLE
         */
        List<String> collected = new ArrayList();
        for(String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected.add(uppercaseString);
        }
        assertEquals(asList("A", "B", "HELLO"), collected);

        /**
         * NUEVO ESTILO.
         */
        List<String> collected2 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(toList());
        assertEquals(asList("A", "B", "HELLO"), collected2);
    }
}
