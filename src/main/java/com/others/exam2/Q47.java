package com.others.exam2;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q47 {
    public static void main(String ...args) {
        LocalDateTime d = LocalDateTime.of(2014, 1, 1, 21, 10, 33);
        Period future = Period.of(1, 1, 1);
        d = d.plus(future);

        DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(format));
    }
}
