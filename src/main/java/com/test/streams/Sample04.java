package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample04 {

    /**
     * Filtra de la lista, aquellos elementos que empiezan con digito.
     * @param args
     */
    public static void main(String ...args) {
        /**
         * OLD STYLE.
         */
        List<String> beginningWithNumbers = new ArrayList<>();
        for (String value : asList("a", "1abc", "abc1")) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers.add(value);
            }
        }
        assertEquals(asList("1abc"), beginningWithNumbers);

        /**
         * NEW STYLE.
         */
        List<String> collected = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());
        assertEquals(asList("1abc"), collected);
    }
}
