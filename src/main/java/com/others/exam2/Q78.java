package com.others.exam2;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q78 {

    public static void main(String ...args) {
        Instant instant = Instant.now();

        instant.plus(5, ChronoUnit.HOURS).plus(5, ChronoUnit.MINUTES);
    }

}
