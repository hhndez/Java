package com.test.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.Assert.*;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample02 {

    /**
     * Transforma de stream a una lista.
     * @param args
     */
    public static void main(String ...args) {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());

        assertEquals(Arrays.asList("a", "b", "c"), collected);

    }
}
