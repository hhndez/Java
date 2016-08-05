package com.others.exam2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q63 {
    public static void main(String ... args) {
        LocalDate christmas = LocalDate.of(2015, 12, 15);
        LocalDate ch1 = LocalDate.of(2015, Calendar.DECEMBER, 25);
        System.out.println(christmas);
        System.out.println(ch1);
    }
}
