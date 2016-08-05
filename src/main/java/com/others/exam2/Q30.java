package com.others.exam2;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q30 {
    public static void main(String ...args) {
        LocalTime start = LocalTime.of(21,10);
        LocalTime end = LocalTime.of(12,12);

        long duration = Duration.between(start, end).toHours();
        System.out.println(duration);
    }
}
